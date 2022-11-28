package com.madina.hw3_m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    TextView countryName;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        countryName = itemView.findViewById(R.id.tv_country_name);
    }
    public void bind (String name){
        countryName.setText(name);
    }
}
