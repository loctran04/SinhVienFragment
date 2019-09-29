package com.example.sinhvienfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {
    ArrayList<Student> studentArrayList;
    StudentAdapter adapter;
    TruyenStudent truyenStudent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        truyenStudent = (TruyenStudent) getActivity();

        studentArrayList = new ArrayList<>();
        AddArrayStudent();
        adapter = new StudentAdapter(getActivity(),R.layout.row_student,studentArrayList);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_studentlist,container,false);
    }
    private void AddArrayStudent(){
        studentArrayList.add(new Student("Michel",1990,"New York","michel@hello.com"));
        studentArrayList.add(new Student("Tim",1995,"Michigan","tim@hello.com"));
        studentArrayList.add(new Student("Kyo",1993,"Mahattan","kyo@hello.com"));
        studentArrayList.add(new Student("Tran",1990,"Ha Noi","tran@hello.com"));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //Toast.makeText(getActivity(), studentArrayList.get(position).getHoTen(),Toast.LENGTH_SHORT).show();
        truyenStudent.dataStudent(studentArrayList.get(position));
    }
}
