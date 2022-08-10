package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class fragment_setting extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_setting,container,false);
        ImageView imageView = v.findViewById(R.id.img1);
        String url = "https://nedrug.mfds.go.kr/pbp/cmn/itemImageDownload/152035092098000085";
        Glide.with(getActivity()).load(url).into(imageView);

        return v;

    }

}
