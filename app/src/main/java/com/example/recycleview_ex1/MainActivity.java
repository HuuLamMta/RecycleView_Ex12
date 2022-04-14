package com.example.recycleview_ex1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Product> listSanPham;
    ProductAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        recyclerView=findViewById(R.id.recyclerview);
        listSanPham=new ArrayList<>();
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p1));
        listSanPham.add(new Product("Samsung Galaxy s21", 12000000.0, R.drawable.p2));
        listSanPham.add(new Product("iphone 11", 12000000.0, R.drawable.p3));
        listSanPham.add(new Product("iphone 11 pro-max", 12000000.0, R.drawable.p4));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p5));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p6));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p7));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p8));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p9));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p1));
        listSanPham.add(new Product("Samsung Galaxy s21", 12000000.0, R.drawable.p2));
        listSanPham.add(new Product("iphone 11", 12000000.0, R.drawable.p3));
        listSanPham.add(new Product("iphone 11 pro-max", 12000000.0, R.drawable.p4));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p5));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p6));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p7));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p8));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p9));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p1));
        listSanPham.add(new Product("Samsung Galaxy s21", 12000000.0, R.drawable.p2));
        listSanPham.add(new Product("iphone 11", 12000000.0, R.drawable.p3));
        listSanPham.add(new Product("iphone 11 pro-max", 12000000.0, R.drawable.p4));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p5));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p6));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p7));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p8));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p9));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p1));
        listSanPham.add(new Product("Samsung Galaxy s21", 12000000.0, R.drawable.p2));
        listSanPham.add(new Product("iphone 11", 12000000.0, R.drawable.p3));
        listSanPham.add(new Product("iphone 11 pro-max", 12000000.0, R.drawable.p4));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p5));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p6));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p7));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p8));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p9));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p1));
        listSanPham.add(new Product("Samsung Galaxy s21", 12000000.0, R.drawable.p2));
        listSanPham.add(new Product("iphone 11", 12000000.0, R.drawable.p3));
        listSanPham.add(new Product("iphone 11 pro-max", 12000000.0, R.drawable.p4));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p5));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p6));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p7));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p8));
        listSanPham.add(new Product("iphone X", 12000000.0, R.drawable.p9));

        sanPhamAdapter=new ProductAdapter(getApplicationContext(),listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }
}