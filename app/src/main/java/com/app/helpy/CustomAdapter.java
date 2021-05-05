package com.app.helpy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private ArrayList<Message> list;

    public CustomAdapter(Context context, ArrayList<Message> list) {
        this.list = list;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint({"InflateParams", "ViewHolder"})
        View view = inflater.inflate(R.layout.list_item, null);
        TextView sender = view.findViewById(R.id.sender);
        TextView body = view.findViewById(R.id.message);
        TextView time = view.findViewById(R.id.time);
        Message message = list.get(position);
        sender.setText(message.getAddress());
        body.setText(message.getBody());
        time.setText(message.getDate());
        return view;
    }

}
