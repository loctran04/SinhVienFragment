package com.example.sinhvienfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Fragment_StudentInfo extends Fragment {
    TextView tvTen,tvNamSinh,tvDiaChi,tvEmail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_infostudent,container,false);

        tvTen = view.findViewById(R.id.tvHoTen);
        tvDiaChi = view.findViewById(R.id.tvDiaChi);
        tvNamSinh = view.findViewById(R.id.tvNamSinh);
        tvEmail = view.findViewById(R.id.tvEmail);

        return view;
    }
    public void setInfoStudent(Student infoStudent){
        tvTen.setText(infoStudent.getHoTen());
        tvNamSinh.setText("Year of Birth: " + infoStudent.getNamSinh());
        tvDiaChi.setText("Address: " + infoStudent.getDiaChi());
        tvEmail.setText("Email: " + infoStudent.getEmail());
    }
}
