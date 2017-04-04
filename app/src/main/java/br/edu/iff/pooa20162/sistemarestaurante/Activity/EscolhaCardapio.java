package br.edu.iff.pooa20162.sistemarestaurante.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import br.edu.iff.pooa20162.sistemarestaurante.Model.Cardapio;
import br.edu.iff.pooa20162.sistemarestaurante.R;

public class EscolhaCardapio extends AppCompatActivity {
    Spinner pratos;
    Button btCriar, btSalvar;
    int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_cardapio);
        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");

        final ArrayList<Cardapio> burg  = (ArrayList) Cardapio.listAll(Cardapio.class);

        ArrayAdapter<Cardapio> adapterB = new ArrayAdapter<Burguer>(this, android.R.layout.simple_spinner_item, burg);
        adapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spB = (Spinner) findViewById(R.id.spinB);
        spB.setAdapter(adapterB);

    }
}
