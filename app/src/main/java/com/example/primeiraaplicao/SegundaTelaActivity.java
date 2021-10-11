package com.example.primeiraaplicao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segunda_tela);

        Intent intentSegundaTela = getIntent();

        String stringNumber = intentSegundaTela.getStringExtra(MainActivity.VALUE);

        Integer number = Integer.parseInt(stringNumber);

        Random random = new Random();

        Integer randomNumber = random.nextInt(number + 1);

        TextView textViewInformation = (TextView) findViewById(R.id.textViewInformation);

        TextView textViewRandomNumber = (TextView) findViewById(R.id.textViewNumberRandom);

        String message = String.format("Foi gerado um número entre 0 e %d", number);

        textViewInformation.setText(message);

        String stringRandomNumber = String.format("%d", randomNumber);

        textViewRandomNumber.setText(stringRandomNumber);
    }

    public void buttonClickReturn(View view){
        finish();
    }
}