package br.edu.iff.pooa20162.sistemarestaurante.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.sistemarestaurante.Model.Cliente;
import br.edu.iff.pooa20162.sistemarestaurante.R;

/**
 * Created by Jessica on 03/04/2017.
 */
public class ClienteAdapter extends ArrayAdapter<Cliente>
{
    private final Context context;
    private final ArrayList<Cliente> clientes;

        public ClienteAdapter(Context context, ArrayList<Cliente> clientes)
        {
            super(context, R.layout.linhacliente, clientes);
            this.context = context;
            this.clientes = clientes;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.linhacliente, parent, false);
            TextView nome = (TextView) rowView.findViewById(R.id.etNome);
            TextView endereco = (TextView) rowView.findViewById(R.id.etEndereco);
            TextView telefone = (TextView) rowView.findViewById(R.id.etTelefone);
            nome.setText(clientes.get(position).getNome());
            endereco.setText(clientes.get(position).getEndereco());
            telefone.setText(clientes.get(position).getTelefone());
            return rowView;
        }
}
