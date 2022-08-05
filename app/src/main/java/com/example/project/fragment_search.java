package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class fragment_search extends Fragment{
        /*private List<String> list;*/

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

           /* list=new ArrayList<String>();

            settingList();

            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getView().findViewById(R.id.autoCompleteTextView);

            autoCompleteTextView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, list));
*/
            return inflater.inflate(R.layout.fragment_search,container,false);

        }

    /*private void settingList() {
        list.add("타이레놀");
        list.add("타이레놀2");
        list.add("타이레놀3");
        list.add("두통약");
        list.add("그날엔");
        list.add("알레르기 약");

    }*/
}

