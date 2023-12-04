package gonzalez.dominguez.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder> {

    private ArrayList<Persona> listaPersonas;
    Context context;

    public Adaptador(Context context, ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.context = context;
    }
    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder holder, int position) {
        Persona persona = listaPersonas.get(position);
        ((viewHolder) holder).asignarDatos(listaPersonas.get(position));

    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombre;
        TextView apellido;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.textView);
            apellido = (TextView) itemView.findViewById(R.id.textView2);
        }

        public void asignarDatos(Persona persona) {
            nombre.setText(persona.getNombre());
            apellido.setText(persona.getApellido());


        }
    }
}
