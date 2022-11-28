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


public class ThirdFragment extends Fragment {
    ArrayList<String> nameList = new ArrayList<>();
    NameAdapter adapter;
    RecyclerView rvName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        adapter = new NameAdapter(nameList);
        rvName = view.findViewById(R.id.rv_name);
        rvName.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");
        nameList.add("zzzzzzzzzzzz");

    }

}
