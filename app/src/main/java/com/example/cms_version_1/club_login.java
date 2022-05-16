package com.example.cms_version_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

public class club_login extends Fragment {

    EditText ed_id;
    EditText ed_pass;
    AppCompatButton btn_login;
    TextView txt_forget;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_club_login, container, false);

        ed_id = view.findViewById(R.id.ed_id);
        ed_pass = view.findViewById(R.id.ed_pass);
        btn_login = view.findViewById(R.id.btn_login);

        return view;
    }
}