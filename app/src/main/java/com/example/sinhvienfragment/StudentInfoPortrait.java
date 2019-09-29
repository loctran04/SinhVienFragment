package com.example.sinhvienfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfoPortrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info_portrait);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("INFO");

        Fragment_StudentInfo fragment_studentInfo = (Fragment_StudentInfo) getFragmentManager()
                .findFragmentById(R.id.fragmentInfoPortrait);
        fragment_studentInfo.setInfoStudent(student);

    }
}
