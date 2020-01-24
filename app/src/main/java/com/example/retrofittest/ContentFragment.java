package com.example.retrofittest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContentFragment extends Fragment {

    TextView text_result;
    String result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);

        text_result = view.findViewById(R.id.text_result);

        text_result.setText(result);
        return view;
    }

    public String getText_result(String result){
        this.result= result;
        return result;
    }
}
