package com.madina.hw3_m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    TextView foodName;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        foodName = itemView.findViewById(R.id.tv_food_name);
    }

    public void bind (String name){
        foodName.setText(name);
}
}
