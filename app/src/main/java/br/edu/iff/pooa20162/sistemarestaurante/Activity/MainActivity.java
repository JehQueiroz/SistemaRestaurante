package br.edu.iff.pooa20162.sistemarestaurante.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.iff.pooa20162.sistemarestaurante.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cardapio = (Button) findViewById(R.id.btCardapio);
        cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Cardapio.class);
                startActivity(intent);
            }
        });
        Button pedido = (Button) findViewById(R.id.btPedido);
        pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Pedido.class);
                startActivity(intent);
            }
        });
        Button conta = (Button) findViewById(R.id.btConta);
        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Conta.class);
                startActivity(intent);
            }
        });
    }

    public void chamaTelaCliente(View v){
            Intent intent = new Intent(MainActivity.this, ListaCliente.class);
            startActivity(intent);
        }
        private Context getContext()
        {
            return this;
        }
}

