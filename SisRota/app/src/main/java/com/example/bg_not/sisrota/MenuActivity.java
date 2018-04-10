package com.example.bg_not.sisrota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void TelaProducao (View viewc){
        Intent tp = new Intent(MenuActivity.this, TelaProducao.class);
        startActivity(tp);
    }

    public void TelaEditar(View view){
        Intent te = new Intent(MenuActivity.this, CadastroUsuarioActivity.class);
        startActivity(te);
    }

    public void TelaRelDiario(View view){
        Intent trd = new Intent(MenuActivity.this, RelatorioDiario.class);
        startActivity(trd);
    }

    public void TelaRelMensal(View view){
        Intent trm = new Intent(MenuActivity.this, RelatorioMensal.class);
        startActivity(trm);
    }

    public void TelaConfig(View view){
        Intent tc = new Intent(MenuActivity.this, TelaConfiguracao.class);
        startActivity(tc);
    }
}
