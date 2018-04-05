package com.example.bg_not.sisrota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      }

      public void TelaCadadstro( View view){
        Intent it = new Intent(LoginActivity.this, CadastroUsuarioActivity.class);
        startActivity(it);
      }

      public void TelaMenu(View viewc){
        Intent tm = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(tm);
      }

}
