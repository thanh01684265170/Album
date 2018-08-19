package com.hungnm.imageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    int layout;
    int[] data;

    public ImageAdapter(Context context, int layout, int[] data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
    }

    private class ViewHolder{
        ImageView img;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(layout,parent,false);

            ViewHolder holder = new ViewHolder();
            holder.img = v.findViewById(R.id.img);
            v.setTag(holder);
        }
         ViewHolder holder = (ViewHolder) v.getTag();
        holder.img.setImageResource(data[position]);


        return v;
    }
}
