package br.edu.iff.pooa20162.sistemarestaurante.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.sistemarestaurante.Model.Cardapio;
import br.edu.iff.pooa20162.sistemarestaurante.R;

/**
 * Created by Jessica on 03/04/2017.
 */
public class CardapioAdapter extends ArrayAdapter<Cardapio> {
    private Context context = null;
    private ArrayList<Cardapio> cardapio = null;

    public CardapioAdapter(Context context, ArrayList<Cardapio> cardapio) {
        super(context, R.layout.linhacardapio, cardapio);
        this.context = context;
        this.cardapio = cardapio;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linhacardapio, parent, false);

        TextView cardapio = (TextView) rowView.findViewById(R.id.btCardapio);


        return rowView;
    }
}
