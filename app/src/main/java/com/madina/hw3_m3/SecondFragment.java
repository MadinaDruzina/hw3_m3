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


public class SecondFragment extends Fragment {
    ArrayList<String> countryList = new ArrayList<>();
    CountryAdapter adapter;
    RecyclerView rvCountry;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        adapter = new CountryAdapter(countryList);
        rvCountry = view.findViewById(R.id.rv_country);
        rvCountry.setAdapter(adapter);
    }

    private void loadData() {
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
        countryList.add("mmmmmmm");
    }

}
