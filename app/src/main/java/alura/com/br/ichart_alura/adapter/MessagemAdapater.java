package alura.com.br.ichart_alura.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import alura.com.br.ichart_alura.R;
import alura.com.br.ichart_alura.models.Messagem;

/**
 * Created by gui on 30/01/2017.
 */

public class MessagemAdapater extends BaseAdapter {

    private List<Messagem> messagens;
    private Activity activity;
    private int idDoCliente;


    public MessagemAdapater(int idDoCliente, List<Messagem> messagens, Activity activity) {
        this.messagens = messagens;
        this.activity = activity;
        this.idDoCliente = idDoCliente;
    }

    @Override
    public int getCount() {
        return messagens.size();
    }

    @Override
    public Messagem getItem(int position) {
        return messagens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
         View linha = activity.getLayoutInflater().inflate(R.layout.messagem, viewGroup,false);
        TextView texto = (TextView) linha.findViewById(R.id.tv_texto);

        Messagem messagem =  getItem(i);


        texto.setText(messagem.getTexto());

        if(idDoCliente !=  messagem.getId()) {
            linha.setBackgroundColor(Color.CYAN);
        }
        texto.setText(messagem.getTexto());
            return linha;
    }
}
