package com.example.project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;


public class detailmedicine extends Fragment {
    public static detailmedicine newInstance() {
        return new detailmedicine();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //fragment인 경우, findViewById를 이용하는 방법
        View view = inflater.inflate(R.layout.fragment_detailmedicine, container, false);


        Spinner spn = (Spinner)view.findViewById(R.id.medi_count_list);

        ArrayAdapter<CharSequence> spn_adapter = ArrayAdapter.createFromResource(getActivity(), R.array.medi_count, android.R.layout.simple_spinner_item);
        spn_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(spn_adapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                Toast.makeText(parent.getContext(), "선택된 용량은 " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> arg0){

            }
        });

        return view;
        //return inflater.inflate(R.layout.fragment_detailmedicine, container, false);
    }
}