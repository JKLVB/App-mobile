package com.example.primeiraaplicao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public static final String VALUE = "com.example.primeiraaplicao.VALOR";

    private TextView textViewNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textViewNumber = (TextView) findViewById(R.id.textViewNumber);

        FloatingActionButton fab = findViewById(R.id.buttonFloatingAction);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer number = Integer.parseInt(textViewNumber.getText().toString());

                if(number > 0){
                    --number;
                }

                textViewNumber.setText(number.toString());
            }
        });
    }

    public void buttonClickToast(View view){
        Toast.makeText(MainActivity.this, "Clicou no botão", Toast.LENGTH_LONG).show();
    }

    public void buttonClickIncrement(View view){

        Integer number = Integer.parseInt(textViewNumber.getText().toString());

        ++number;

        textViewNumber.setText(number.toString());
    }

    public void buttonClickRandom(View view){
        Intent intentSegundaTela = new Intent(this, SegundaTelaActivity.class);

        intentSegundaTela.putExtra(VALUE, textViewNumber.getText().toString());

        startActivity(intentSegundaTela);
    }
}