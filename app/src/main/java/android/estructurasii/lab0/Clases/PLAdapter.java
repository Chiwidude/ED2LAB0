package android.estructurasii.lab0.Clases;

import android.content.Context;
import android.estructurasii.lab0.R;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class PLAdapter extends RecyclerView.Adapter<PLAdapter.CancionViewHolder>{
private Context MyContext;
private ArrayList<Canción> Biblioteca;
private static ArrayList<String> keys;
    public PLAdapter(Context miContexto, ArrayList<Canción> biblioteca){
        this.MyContext = miContexto;
        this.Biblioteca = biblioteca;
        //keys = new ArrayList(this.Biblioteca.keySet());

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
        Canción Song = Biblioteca.get(position);
        holder.textView1.setText(Song.getNombre());
        holder.textView2.setText(Song.getArtista());
        holder.textView3.setText(Song.getAlbum());
        holder.textView4.setText(String.format("%.2f", Song.getDuración()));


    }
    @Override
    public int getItemCount() {
        return Biblioteca.size();
    }
    public void Search(ArrayList<Canción> toSearch,ArrayList<String> llaves){
        keys = llaves;
        Biblioteca = toSearch;
        notifyDataSetChanged();
    }


   public static class CancionViewHolder extends RecyclerView.ViewHolder {
           public TextView textView1;
           public TextView textView2;
           public TextView textView3;
           public TextView textView4;

        public CancionViewHolder(@NonNull View itemView) {

            super(itemView);
            textView1 = (TextView)itemView.findViewById(R.id.textView1);
            textView2 = (TextView)itemView.findViewById(R.id.textView2);
            textView3 = (TextView)itemView.findViewById(R.id.textView3);
            textView4 = (TextView)itemView.findViewById(R.id.textView4);
        }
    }
}

