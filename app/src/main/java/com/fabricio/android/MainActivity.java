package com.fabricio.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String[] resposta = {"sim","Não conte com isso","Talvez"};
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo criado para executar a ação do botão
    public void acaoButton(View view) {

        TextView helloTextView = findViewById(R.id.textView);
        EditText palavra =  findViewById(R.id.TextPersonName);

        if(palavra.getText().length()<=0){

            helloTextView.setText("Faça a sua pergunta");

        }else{
            //receber o valor randomico
            int index = random.nextInt(3);

            helloTextView.setText(resposta[index]);

            palavra.setText(null);
        }
    }



}