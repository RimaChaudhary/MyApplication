package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.module.Food;

import java.util.ArrayList;
import java.util.List;

public class RvActivity extends AppCompatActivity {
    RecyclerView recyclerView;

   private List<Food>foods = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);

        recyclerView =findViewById(R.id.rvFoods);

        getData();
        MyRvAdapter adapter=new MyRvAdapter(foods);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);






//        MyRvAdapter adapter = new MyRvAdapter(foods);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);


    }
    private void getData(){
        foods.add(new Food("Momo","Chicken","150",R.drawable.img1));
        foods.add(new Food("Chowmin","Chicken","150",R.drawable.img2));
        foods.add(new Food("Pizza","Chicken","150",R.drawable.img3));
    }
}
