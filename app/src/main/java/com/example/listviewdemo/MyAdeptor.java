package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdeptor extends ArrayAdapter<String> {

    String[] arr; //={"item1","item2","item3","item4","item5","item6","item7","item8","item11","item21","item31","item41","item51","item61","item71","item81"};

    // need to override one constructor
    public MyAdeptor(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
    }
    //override getitem method
    @Override
    public String getItem(int position)
    {
        return arr[position];
    }

    //override getview method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //LayoutInflater is use to convert layout.xml file to onr type of layout
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.myloayout1,parent,false);
        //coustmize layout tectview of convertview
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        return convertView;
    }
}
