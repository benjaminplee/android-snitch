package com.yardspoon.androidsnitch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends SnitchAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.launch_simple_activity).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SimpleActivity.class));
            }
        });
    }
}
