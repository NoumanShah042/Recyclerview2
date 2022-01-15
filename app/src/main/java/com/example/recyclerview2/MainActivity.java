package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv =  findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[] = {"C", "C++", "JAVA", "PHP", ".NEt", "JQuery", "C", "C++", "JAVA", "PHP", ".NEt", "JQuery", "C", "C++", "JAVA", "PHP", ".NEt", "JQuery"};
        rcv.setAdapter(new myAdapter(arr));

    }
}

/*
*    1) add dependency
*    2) create single row xml file
*    3) create mainXML file and add recycler view in it
*    4) set layout manager for recycler view
*    5) create adapter class
*    6) set adapter
*
*
* */