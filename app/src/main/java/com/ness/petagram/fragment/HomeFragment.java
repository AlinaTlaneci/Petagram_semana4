package com.ness.petagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ness.petagram.pojo.Mascotas;
import com.ness.petagram.R;
import com.ness.petagram.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ArrayList<Mascotas> mascotas;
    private RecyclerView rvPetagram;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        rvPetagram = v.findViewById(R.id.rvPetagram);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPetagram.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        return v;
    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,getActivity());
        rvPetagram.setAdapter(adaptador);

    }

    private void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.matiflor, "Mati en su florecita"));
        mascotas.add(new Mascotas(R.drawable.matilindo, "Mati súper lindo" ));
        mascotas.add(new Mascotas(R.drawable.matibanado, "Mati bañadito"));
        mascotas.add(new Mascotas(R.drawable.matiacostado, "Mati con flojera"));
        mascotas.add(new Mascotas(R.drawable.maticoche, "Mati feliz"));
        mascotas.add(new Mascotas(R.drawable.matiasoleado, "Mati tomando el sol"));
        mascotas.add(new Mascotas(R.drawable.maticaricias, "Mati pidiendo caricias"));
        mascotas.add(new Mascotas(R.drawable.maticomida, "Mati pidiendo comida"));
        mascotas.add(new Mascotas(R.drawable.matiperfil, "Mati con chalequito"));
        mascotas.add(new Mascotas(R.drawable.matitrono, "Mati en su trono"));


    }
}
