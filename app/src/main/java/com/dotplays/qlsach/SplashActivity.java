package com.dotplays.qlsach;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends BaseActivity {

    @Override
    public int setLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void initViews() {



    }

    public void openHome(View view) {
        openActivity(HomeActivity.class);
    }
}
