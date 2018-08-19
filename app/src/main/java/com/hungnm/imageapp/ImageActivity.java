package com.hungnm.imageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    private Gallery gallery;
    private ImageView img;
    private GaleryAdapter adapter;
    private int[] data = {R.drawable.anh1, R.drawable.anh2,R.drawable.anh3,R.drawable.anh4,R.drawable.anh5,R.drawable.anh6,
            R.drawable.anh7,R.drawable.anh8,R.drawable.anh9,R.drawable.anh10,R.drawable.anh11,R.drawable.anh12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        gallery = findViewById(R.id.gallery);
        img = findViewById(R.id.img);
        Intent intent = this.getIntent();
        int postion = intent.getIntExtra("position", 0);
        img.setImageResource(data[postion]);
        adapter = new GaleryAdapter(this,data);
        adapter.notifyDataSetChanged();
        gallery.setAdapter(adapter);
        gallery.setSelection(postion);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                img.setImageResource(data[position]);
                gallery.setSelected(true);
            }
        });

    }
}
