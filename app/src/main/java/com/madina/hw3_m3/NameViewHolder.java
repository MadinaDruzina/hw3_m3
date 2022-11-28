package com.madina.hw3_m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView nameName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String name) {
        nameName.setText(name);
    }
}
