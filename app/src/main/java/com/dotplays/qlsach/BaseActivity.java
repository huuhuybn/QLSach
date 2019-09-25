package com.dotplays.qlsach;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

     public abstract int setLayout();

     public abstract void initViews();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initViews();
    }

    public void openActivity(Class target) {

        Intent intent = new Intent(this, target);
        startActivity(intent);

    }

}
