package android.estructurasii.lab0.Clases;

import android.content.Context;
import android.estructurasii.lab0.R;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.stream.Collectors;

public class ElAdaptador extends RecyclerView.Adapter<ElAdaptador.CancionViewHolder> implements View.OnClickListener{
private Context MyContext;
private HashMap<String,Canción> Biblioteca;
private ArrayList<String> keys;
    public ElAdaptador(Context miContexto, HashMap<String,Canción>biblioteca){
        this.MyContext = miContexto;
        this.Biblioteca = biblioteca;
        keys = new ArrayList(this.Biblioteca.keySet());
    }
    @NonNull
    @Override
    public CancionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflador = LayoutInflater.from(MyContext);
        View Vista = Inflador.inflate(R.layout.iteminterface,null);
        CancionViewHolder Holder = new CancionViewHolder(Vista);
        return Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CancionViewHolder holder, int position) {
       Canción Song = Biblioteca.get(keys.get(position));
        holder.textView1.setText(Song.getNombre());
        holder.textView2.setText(Song.getArtista());
        holder.textView3.setText(Song.getAlbum());
        holder.textView4.setText(String.format("%.2f",Song.getDuración()));


    }
    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View v) {

    }

    class CancionViewHolder extends RecyclerView.ViewHolder {
            TextView textView1;
            TextView textView2;
            TextView textView3;
            TextView textView4;

        public CancionViewHolder(@NonNull View itemView) {

            super(itemView);
            textView1 = (TextView)itemView.findViewById(R.id.textView1);
            textView2 = (TextView)itemView.findViewById(R.id.textView2);
            textView3 = (TextView)itemView.findViewById(R.id.textView3);
            textView4 = (TextView)itemView.findViewById(R.id.textView4);
        }
    }
}

