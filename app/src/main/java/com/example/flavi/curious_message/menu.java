package com.example.flavi.curious_message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void chamaentrar(View v) {
        setContentView(R.layout.activity_entrar);
    }

    public void chamacriar(View v) {
        setContentView(R.layout.activity_criarconta);
    }

    public void voltar(View v) {
        setContentView(R.layout.activity_menu);
    }

    public void voltar2(View v) {
        setContentView(R.layout.activity_menu);
    }
}
