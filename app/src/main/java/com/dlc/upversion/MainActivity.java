package com.dlc.upversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent updateIntent = new Intent(MainActivity.this, UpdateAppService.class);
        updateIntent.putExtra("titleId", R.string.app_name);
        updateIntent.putExtra(UpdateAppService.APK_UIL, url);//传apk下载链接过去即可
        startService(updateIntent);
    }
}
