package br.edu.iff.pooa20162.sistemarestaurante.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.sistemarestaurante.Adapter.ClienteAdapter;
import br.edu.iff.pooa20162.sistemarestaurante.Model.Cliente;
import br.edu.iff.pooa20162.sistemarestaurante.R;

public class ListaCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaCliente.this, CadastroCliente.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });
    }
    /*protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.lvCliente);

        final ArrayList<Cliente> cli = (ArrayList<Cliente>)
                Cliente.listAll(Cliente.class);

        ArrayAdapter adapter = new ClienteAdapter(this, cli);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaCliente.this, CadastroCliente.class);
                intent.putExtra("id", cli.get(i).getId().intValue());
                intent.putExtra("nome", cli.get(i).getNome());
                intent.putExtra("endereco", cli.get(i).getEndereco());
                intent.putExtra("telefone", cli.get(i).getTelefone());
                startActivity(intent);

            }
        });
    }*/
}