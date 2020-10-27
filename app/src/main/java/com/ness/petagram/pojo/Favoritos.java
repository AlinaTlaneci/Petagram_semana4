package com.ness.petagram.pojo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ness.petagram.R;
import com.ness.petagram.adapter.FavoritosAdaptador;
import com.ness.petagram.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    ArrayList<Mascotas>  mascotas;

    private RecyclerView rvPetagram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rvPetagram = findViewById(R.id.rvPetagram);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPetagram.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public FavoritosAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new FavoritosAdaptador(mascotas,this);
        rvPetagram.setAdapter(adaptador);
    }

    private void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.matiflor, "Mati en su florecita"));
        mascotas.add(new Mascotas(R.drawable.matilindo, "Mati súper lindo" ));
        mascotas.add(new Mascotas(R.drawable.matibanado, "Mati bañadito"));
        mascotas.add(new Mascotas(R.drawable.matiacostado, "Mati con flojera"));
        mascotas.add(new Mascotas(R.drawable.maticoche, "Mati feliz"));

    }
}