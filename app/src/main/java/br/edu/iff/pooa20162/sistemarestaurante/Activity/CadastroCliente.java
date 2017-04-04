package br.edu.iff.pooa20162.sistemarestaurante.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.iff.pooa20162.sistemarestaurante.Model.Cliente;
import br.edu.iff.pooa20162.sistemarestaurante.R;

public class CadastroCliente extends AppCompatActivity {
    int id;
    Button btCriar,btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);
        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");
        final EditText etnome = (EditText) findViewById(R.id.etNome);
        final EditText etendereco = (EditText) findViewById(R.id.etEndereco);
        final EditText ettelefone = (EditText) findViewById(R.id.etTelefone);

        btCriar = (Button) findViewById(R.id.btCriar);
        btSalvar = (Button) findViewById(R.id.btSalvaCli);

        String nome = (String) intent.getSerializableExtra("nome");
        String endereco = (String) intent.getSerializableExtra("endereco");
        String telefone = (String) intent.getSerializableExtra("telefone");

        /*etnome.setText(nome);
        etendereco.setText(endereco);
        ettelefone.setText(telefone);

        /*if (id != 0) {
            btCriar.setEnabled(false);
            btCriar.setClickable(false);
            btCriar.setVisibility(View.INVISIBLE);
            etnome.setText(nome);
            etendereco.setText(endereco);
            ettelefone.setText(telefone);
        } else {
            btSalvar.setEnabled(false);
            btSalvar.setClickable(false);
            btSalvar.setVisibility(View.INVISIBLE);
        }*/


        btCriar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Cliente cli = new Cliente(etnome.getText().toString(), etendereco.getText().toString(), ettelefone.getText().toString());
                cli.save();
                Intent intent = new Intent(CadastroCliente.this, ListaCliente.class);
                startActivity(intent);
                finish();
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cliente cli = Cliente.findById(Cliente.class, id);

                cli.setNome(etnome.getText().toString());
                cli.setEndereco(etendereco.getText().toString());
                cli.setTelefone(ettelefone.getText().toString());

                cli.save();
                finish();
            }
        });
    }

}

