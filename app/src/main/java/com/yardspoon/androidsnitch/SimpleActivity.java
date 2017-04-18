package com.yardspoon.androidsnitch;

import android.os.Bundle;

public class SimpleActivity extends SnitchAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }
}
