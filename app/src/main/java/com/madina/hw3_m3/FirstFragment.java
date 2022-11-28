package com.madina.hw3_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    ArrayList<String> foodList= new ArrayList<>();
    FoodAdapter adapter;
    RecyclerView rvFood;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        adapter = new FoodAdapter(foodList);
        rvFood = view.findViewById(R.id.rv_food);
        rvFood.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
        foodList.add("lllll");
    }
}