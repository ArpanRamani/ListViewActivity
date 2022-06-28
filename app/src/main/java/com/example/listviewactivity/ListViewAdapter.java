package com.example.listviewactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

    String[] name;
    MainActivity mainActivity;
    int activity_list_view;
    String[] no;
    int[] image;

    public ListViewAdapter(MainActivity mainActivity, int activity_list_view, String[] name, String[] no, int[] image) {

        this.name = name;
        this.mainActivity = mainActivity;
        this.activity_list_view = activity_list_view;
        this.no = no;
        this.image = image;

    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.activity_list_view,null);
        TextView txtName = convertView.findViewById(R.id.txtName);
        txtName.setText(name[position]);
        TextView txtNo = convertView.findViewById(R.id.txtNo);
        txtNo.setText(no[position]);
        ImageView imgUser = convertView.findViewById(R.id.imgUser);
        imgUser.setBackgroundResource(image[position]);

        return convertView;
    }
}
