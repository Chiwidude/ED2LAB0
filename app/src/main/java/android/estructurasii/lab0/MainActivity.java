package android.estructurasii.lab0;

import android.estructurasii.lab0.Clases.Canción;
import android.estructurasii.lab0.Clases.ElAdaptador;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static HashMap<String,Canción> Lista = new HashMap<>();

    RecyclerView MyRecyclerView;
    ElAdaptador adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetData();
        MyRecyclerView = (RecyclerView)findViewById(R.id.RecyclerView1);
        MyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter1 = new ElAdaptador(this, Lista);
        MyRecyclerView.setAdapter(adapter1);



    }

    //
    //Este método agrega los datos al HashMap, para su posterior uso
    //
    private void SetData(){
        Lista.put("Living La Vida Loca", new Canción("Living La Vida Loca", 4.03, "Ricky Martin", "Ricky Martin"));
        Lista.put("SexyBack", new Canción("SexyBack", 4.02, "Justin Timberlake", "FutureSex/LoveSounds"));
        Lista.put("Mirrors", new Canción("Mirrors", 8.04, "Justin Timberlake", "The 20/20 Experience"));
        Lista.put("Everyday", new Canción("Everyday", 3.25, "Logic", "Bobby Tarantino II"));
        Lista.put("Smooth Criminal", new Canción("Smooth Criminal", 4.18, "Michael Jackson", "Bad"));
        Lista.put("Its Wrong", new Canción("Its Wrong", 2.51, "Michael Calfan", "Its Wrong"));
        Lista.put("Rockstar", new Canción("Rockstar", 3.38, "Post Malone", "Bearbongs & Bentleys"));
        Lista.put("Better Now", new Canción("Better Now", 3.51, "Post Malone", "Bearbongs & Bentleys"));
        Lista.put("White Iverson", new Canción("White Iverson", 4.17, "Post Malone", "Stoney"));
        Lista.put("Congratulations", new Canción("Congratulations", 3.40, "post Malone", "Stoney"));
        Lista.put("Déjala que vuelva", new Canción("Déjala que vuelva", 3.40, "Piso 21", "Ubuntu"));
        Lista.put("Hey Dj", new Canción("Hey Dj", 3.26, "CNCO", "CNCO"));
        Lista.put("Theres Nothing Holding Me Back", new Canción("Theres Nothing Holding Me Back", 3.19, "Shawn Mendes", "Illuminate"));
        Lista.put("Somewhere I Belong", new Canción("Somewhere I Belong", 3.33, "Linkin Park", "Meteora"));
        Lista.put("Papercut", new Canción("Papercut", 3.04, "Linkin Park", "hybrid Theory"));
        Lista.put("Heavy ", new Canción("Heavy", 2.49, "Linkin Park", "One More Light"));
        Lista.put("What Ive Done", new Canción("What ive Done", 3.25, "Linkin Park", "Minutes to Midnight"));
        Lista.put("Burn It Down", new Canción("Burn It Down", 3.50, "Linkin Park", "Living Things"));
        Lista.put("Waiting For The End", new Canción("Waiting For The End", 3.51, "Linkin Park", "A Thousand Suns"));
        Lista.put("Heaven To Me ", new Canción("Heaven To Me", 2.55, "Don Diablo", "Heaven To Me"));

    }
}
