package android.estructurasii.lab0;

import android.content.Intent;
import android.estructurasii.lab0.Clases.Canción;
import android.estructurasii.lab0.Clases.ElAdaptador;
import android.estructurasii.lab0.Clases.PLAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class playlist extends AppCompatActivity {
    RecyclerView MyRecyclerView;
    ArrayList<Canción> PlayList;
    PLAdapter adapter1;
    Button bOrdenxNombre;
    Button bOrdenxDuracion;
    TextView Orden;
    MainActivity Principal;
    int OrdenActual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist2);
        PlayList = (ArrayList<Canción>)getIntent().getSerializableExtra("aPlayList");
        Principal = new MainActivity();
        LlenarPlayList();
        Orden = (TextView) findViewById(R.id.tvOrden);
        bOrdenxNombre = (Button)findViewById(R.id.bOxNombre);
        bOrdenxNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Nombre Ascendente 1
                if (OrdenActual != 1 && OrdenActual == 2)
                {
                    OrdenActual = 1;
                    Orden.setText("Ordenado Por: Nombre Ascendente");
                    OrdenarxNombre(OrdenActual);
                    LlenarPlayList();
                }
                //Nombre Descendente 2
                else if (OrdenActual != 2 && OrdenActual == 1)
                {
                    OrdenActual = 2;
                    Orden.setText("Ordenado Por: Nombre Descendente");
                    OrdenarxNombre(OrdenActual);
                    LlenarPlayList();
                }
                // Defaul Ascendente
                else
                {
                    OrdenActual = 1;
                    Orden.setText("Ordenado Por: Nombre Ascendente");
                    OrdenarxNombre(OrdenActual);
                    LlenarPlayList();
                }
            }
        });
        bOrdenxDuracion = (Button)findViewById(R.id.bOxDuracion);
        bOrdenxDuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Nombre Ascendente 3
                if (OrdenActual != 3 && OrdenActual == 4)
                {
                    OrdenActual = 3;
                    Orden.setText("Ordenado Por: Duración Ascendente");
                    OrdenarxDuracion(OrdenActual);
                    LlenarPlayList();
                }
                //Nombre Descendente 4
                else if (OrdenActual != 4 && OrdenActual == 3)
                {
                    OrdenActual = 4;
                    Orden.setText("Ordenado Por: Duración Descendente");
                    OrdenarxDuracion(OrdenActual);
                    LlenarPlayList();
                }
                // Defaul Ascendente
                else
                {
                    OrdenActual = 3;
                    Orden.setText("Ordenado Por: Duración Ascendente");
                    OrdenarxDuracion(OrdenActual);
                    LlenarPlayList();
                }

            }
        });

    }

    // Método para Ordenar por Nombre
    public void OrdenarxNombre(int OrdenActual)
    {
        if (OrdenActual == 1)
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new String(o1.getNombre()).compareTo(new String(o2.getNombre()));
                }
            });
        }
        else if(OrdenActual == 2)
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new String(o2.getNombre()).compareTo(new String(o1.getNombre()));
                }
            });
        }
        else
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new String(o1.getNombre()).compareTo(new String(o2.getNombre()));
                }
            });
        }
    }

    // Método para Ordenar por Duración
    public void OrdenarxDuracion(int OrdenActual)
    {
        if (OrdenActual == 3)
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new Double(o1.getDuración()).compareTo(new Double(o2.getDuración()));
                }
            });
        }
        else if(OrdenActual == 4)
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new Double(o2.getDuración()).compareTo(new Double(o1.getDuración()));
                }
            });
        }
        else
        {
            Collections.sort(PlayList, new Comparator<Canción>() {
                @Override
                public int compare(Canción o1, Canción o2) {
                    return new Double(o1.getDuración()).compareTo(new Double(o2.getDuración()));
                }
            });
        }
    }

    public void LlenarPlayList()
    {
        if(PlayList.isEmpty())
        {
            Canción Cancion = new Canción("Vacío", 0, "Vacío", "Vacío");
            Principal.aPlayList.add(Cancion);
        }
        MyRecyclerView = (RecyclerView) findViewById(R.id.rvPL);
        MyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter1 = new PLAdapter(this, PlayList);
        MyRecyclerView.setAdapter(adapter1);
    }

}
