package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvaleatorio;
    Button aleatorios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvaleatorio=findViewById(R.id.tvaleatorio);
        aleatorios=findViewById(R.id.aleatorios);

        aleatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numerosAleatorios();
            }
        });
    }

    private void numerosAleatorios() {
        String aux="";

        int[] numeros = new int[10];

        for (int i=0; i<numeros.length;i++){
            numeros[i]= (int) (Math.random() *10);

            for( int j=0;j< numeros.length;j++){

                if(i==j){

                    continue;

                } else if (numeros[i]==numeros[j]){ {


                    numeros[i]= (int) (Math.random() *10);
                    j=-1;



                }

                }

            }
            aux=aux + (i+1) + "=" + numeros[i] + "\n";

        }
        tvaleatorio.setText(aux);
    }
}