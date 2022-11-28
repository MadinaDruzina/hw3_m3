package com.madina.hw3_m3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    private Button btnFirstRv, btnSecondRv, btnThirdRv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnFirstRv = view.findViewById(R.id.btn_first_rv);
        btnSecondRv = view.findViewById(R.id.btn_second_rv);
        btnThirdRv = view.findViewById(R.id.btn_third_rv);

        btnFirstRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new FirstFragment()).commit();
            }
        });

        btnSecondRv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new SecondFragment()).commit();
            }
        });

        btnThirdRv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new ThirdFragment()).commit();
            }
        });

    }
}