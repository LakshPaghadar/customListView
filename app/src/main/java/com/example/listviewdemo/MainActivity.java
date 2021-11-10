package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview1;
    String arr[]= {"item1","item2","item3","item4","item5","item6","item7","item8","item11","item21","item31","item41","item51","item61","item71","item81"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview1 = findViewById(R.id.ListView);

        //simple list view

        //ArrayAdapter ad =new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        //listview1.setAdapter(ad);

        //costom listView
        MyAdeptor ad = new MyAdeptor(this,R.layout.myloayout1,arr);
        listview1.setAdapter(ad);


    }
}