package com.example.sinhvienfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenStudent{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void dataStudent(Student student) {
        Fragment_StudentInfo fragment_studentInfo = (Fragment_StudentInfo) getFragmentManager()
                .findFragmentById(R.id.fragmentInfo);
        Configuration configuration = getResources().getConfiguration();
        if (fragment_studentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragment_studentInfo.setInfoStudent(student);
        }
        else {
            Intent intent = new Intent(this,StudentInfoPortrait.class);
            intent.putExtra("INFO",student);
            startActivity(intent);
        }

    }
}
