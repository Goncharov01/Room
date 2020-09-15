package com.example.room;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    private Button btnAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnAdd = view.findViewById(R.id.buttonInsert);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.buttonInsert:
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_content, new AddEmployeeFragment())
                                .addToBackStack(null)
                                .commit();
                        break;
                }
            }
        });
        return view;
    }

}
