package com.example.hong.stylei;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import jp.wasabeef.blurry.Blurry;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                long startMs = System.currentTimeMillis();
                Blurry.with(SubActivity.this)
                        .radius(10)
                        .sampling(1)
                        .capture(findViewById(R.id.right_top))
                        .into((ImageView) findViewById(R.id.right_top));

                Blurry.with(SubActivity.this)
                        .radius(20)
                        .sampling(1)
                        .animate(500)
                        .capture(findViewById(R.id.right_bottom))
                        .into((ImageView) findViewById(R.id.right_bottom));

                Blurry.with(SubActivity.this)
                        .radius(30)
                        .sampling(1)
                        .async()
                        .capture(findViewById(R.id.left_bottom))
                        .into((ImageView) findViewById(R.id.left_bottom));

                Log.d(getString(R.string.app_name),
                        "TIME " + String.valueOf(System.currentTimeMillis() - startMs) + "ms");
            }
        });

        findViewById(R.id.button).setOnLongClickListener(new View.OnLongClickListener() {

            private boolean blurred = false;

            @Override public boolean onLongClick(View v) {
                if (blurred) {
                    Blurry.delete((ViewGroup) findViewById(R.id.content));
                } else {
                    long startMs = System.currentTimeMillis();
                    Blurry.with(SubActivity.this)
                            .radius(25)
                            .sampling(2)
                            .async()
                            .animate(500)
                            .onto((ViewGroup) findViewById(R.id.content));
                    Log.d(getString(R.string.app_name),
                            "TIME " + String.valueOf(System.currentTimeMillis() - startMs) + "ms");
                }

                blurred = !blurred;
                return true;
            }
        });
    }
}
