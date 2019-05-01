package com.example.jafarifarm.exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("Tags","Starting APP Android in MyPhone");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tags","Resume APP Android in MyPhone");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tags","Pause APP Android in MyPhone");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tags","Stop APP Android in MyPhone");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tags","Destroy APP Android in MyPhone");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tags","Restart APP Android in MyPhone");
    }
}
