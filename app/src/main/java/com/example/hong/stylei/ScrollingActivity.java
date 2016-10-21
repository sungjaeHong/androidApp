package com.example.hong.stylei;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

import jp.wasabeef.blurry.Blurry;

import static com.example.hong.stylei.R.id.fab;

public class ScrollingActivity extends AppCompatActivity {
    String TAG = "STYLEI";
    private boolean blurred = false;
    FrameLayout backgroundBlur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        backgroundBlur = (FrameLayout)findViewById(R.id.blur);
        backgroundBlur.setAlpha(1);
        backgroundBlur.setVisibility(View.VISIBLE);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blurred){
                    //backgroundBlur.setVisibility(View.GONE);
                    backgroundBlur.setAlpha(1);
                    Blurry.delete((ViewGroup) findViewById(R.id.blur));
                    Snackbar.make(view, "블러 효과 지우기 " + blurred, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                } else{
                    //backgroundBlur.setVisibility(View.VISIBLE);
                    backgroundBlur.setAlpha(0);
                    Blurry.with(ScrollingActivity.this).radius(30).sampling(2).async().animate(300).onto((ViewGroup)findViewById(R.id.blur));
                    Snackbar.make(view, "블러 효과 주기 " + blurred, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }

                blurred = !blurred;
            }
        });
        ListView listView;
        ListViewAdapter adapter;




        adapter = new ListViewAdapter();

        listView = (ListView)findViewById(R.id.listView2);
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

            }

        });
    }
}
