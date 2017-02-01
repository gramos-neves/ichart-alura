package alura.com.br.ichart_alura.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import alura.com.br.ichart_alura.R;
import alura.com.br.ichart_alura.adapter.MessagemAdapater;
import alura.com.br.ichart_alura.models.Messagem;

public class MainActivity extends AppCompatActivity {

    private int idDoCliente = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv_messagem);

        List<Messagem>  messagens = Arrays.asList(new Messagem("Hello",1), new Messagem("hello 2",2));

        MessagemAdapater adapater =  new MessagemAdapater(idDoCliente,messagens,this);

         listView.setAdapter(adapater);

     }
}
