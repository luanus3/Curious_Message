package com.example.flavi.curious_message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class entrar extends AppCompatActivity {

    Button ImageButton;
    EditText usuario, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        usuario = (EditText) findViewById(R.id.editText);
        senha = (EditText) findViewById(R.id.editText2);
        ImageButton = (Button) findViewById(R.id.button);

    }


    public void ImageButon(View view){
        if(usuario.getText().toString().equals("meteoro") && senha.getText().toString().equals("luan") ){
            Toast.makeText(getApplicationContext(), "Entrando...", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_conversas);
        }


    }

    //public void chamamenu(View v) {setContentView(R.layout.activity_menu);}


}
