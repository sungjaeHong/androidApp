package com.example.hong.stylei;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import static com.example.hong.stylei.R.drawable.ic_launcher;

public class MainActivity extends AppCompatActivity {
    String TAG = "STYLEI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Hong", "테스트 1");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Sung", "테스트 2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_launcher), "Jae", "테스트 3");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Log.i(TAG,"position : "+position + ", id : " + id);
                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }

        });
    }
}
