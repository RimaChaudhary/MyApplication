package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.module.Food;

import java.util.ArrayList;
import java.util.List;

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyHolder> {

    private List<Food> foodList = new ArrayList<>();

    public MyRvAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_food_rv, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Food food = foodList.get(position);
        holder.tvName.setText(food.getName());
        holder.tvCat.setText(food.getCateg());
        holder.tvPrice.setText(food.getPrice());
        holder.imageView.setImageResource(food.getImg());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tvCat, tvPrice;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.foodImg);
            tvName = itemView.findViewById(R.id.foodName);
            tvCat = itemView.findViewById(R.id.foodCat);
            tvPrice = itemView.findViewById(R.id.foodPrice);
        }
    }
}
