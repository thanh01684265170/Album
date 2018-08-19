package com.hungnm.imageapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GaleryAdapter extends BaseAdapter {
    private Context context;
    private int[] data;

    public GaleryAdapter(Context context, int[] data) {
        this.context = context;
        this.data = data;
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
        ImageView img = new ImageView(context);
        img.setImageResource(data[position]);
        img.setLayoutParams(new Gallery.LayoutParams(200,200));
        return img;
    }
}
