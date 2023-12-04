package gonzalez.dominguez.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private Adaptador adaptador;

    ArrayList<Persona> listaPersonas = new ArrayList();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaPersonas.add(new Persona("Tomas", "gonzalez"));
        listaPersonas.add(new Persona("Tomas", "gonzalez"));
        adaptador = new Adaptador(this, listaPersonas);
        recycler =  findViewById(R.id.contenedor);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}