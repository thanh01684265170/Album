package com.hungnm.imageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView grdView;
    private ImageAdapter adapter;
    private int[] data = {R.drawable.anh1, R.drawable.anh2,R.drawable.anh3,R.drawable.anh4,R.drawable.anh5,R.drawable.anh6,
            R.drawable.anh7,R.drawable.anh8,R.drawable.anh9,R.drawable.anh10,R.drawable.anh11,R.drawable.anh12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grdView = findViewById(R.id.grdImg);
        adapter = new ImageAdapter(this,R.layout.layout_image, data);
        adapter.notifyDataSetChanged();
        grdView.setAdapter(adapter);

        grdView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });

    }
}
