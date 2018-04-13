package com.example.bg_not.aula120418;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected  void onStart(){
        super.onStart();
        Log.i("teste","app Iniciada");
    }
    protected  void onResume(){
        super.onResume();
        Log.i("teste","app Resumida");
    }
    protected  void onPause(){
        super.onPause();
        Log.i("teste","app Pausada");
    }
    @SuppressLint("MissingSuperCall")
    protected  void onStop() {
        super.onStop();
        Log.i("teste", "app Parada");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i("teste","app Restart");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("teste","app Restart");
    }
}
