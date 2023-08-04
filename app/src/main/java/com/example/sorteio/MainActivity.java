package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View view) {
        int numeroSorteado = (int) (Math.random()*11);

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("O número sorteado foi: " + numeroSorteado);
    }
}
