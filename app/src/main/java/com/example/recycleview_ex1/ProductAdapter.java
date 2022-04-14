package com.example.recycleview_ex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    Context context;
    ArrayList<Product> listproduct;

    public ProductAdapter(Context context, ArrayList<Product> listproduct) {
        this.context = context;
        this.listproduct = listproduct;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_custom, parent, false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
Product pro = listproduct.get(position);
holder.txtTenSanPham.setText(pro.getName_product());
        Locale locale = new Locale("vn", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        holder.txtGiaSanPham.setText(currencyFormatter.format(pro.getPrice_product()));
        holder.imgAvatar.setImageResource(pro.getImage_product());
    }

    @Override
    public int getItemCount() {
        return listproduct.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvatar;
        TextView txtTenSanPham, txtGiaSanPham;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = (ImageView) itemView.findViewById(R.id.imgAvatar);
            txtGiaSanPham = (TextView) itemView.findViewById(R.id.txtGiaSanPham);
            txtTenSanPham = (TextView) itemView.findViewById(R.id.txtTenSanPham);
        }
    }
}
