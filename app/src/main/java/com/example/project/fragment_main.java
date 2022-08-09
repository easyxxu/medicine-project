package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class fragment_main extends Fragment{

    //각각의 Fragment마다 Instance를 반환해 줄 메소드를 생성
    public static fragment_main newInstance() {
        return new fragment_main();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null); //Fragment로 불러올 xml파일을 view로 가져옴. (java의 해당 xml파일 입력)
        Button button1 = (Button)view.findViewById(R.id.detail_button); //클릭 시 Fragment를 전환할 event를 발생시킬 버튼을 정)

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // getActivity()로 MainActivity의 replaceFragment를 불러옵니다.
                ((MainActivity)getActivity()).replaceFragment(detailmedicine.newInstance());
                // 새로 불러올 Fragment의 Instance를 Main으로 전달
            }
        });

        return view;
    }
}
