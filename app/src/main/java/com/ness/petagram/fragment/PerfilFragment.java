package com.ness.petagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ness.petagram.R;
import com.ness.petagram.adapter.MascotaAdaptador;
import com.ness.petagram.adapter.PerfilAdaptador;
import com.ness.petagram.pojo.Mascotas;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ArrayList<Mascotas> mascotas;
    private RecyclerView rvFragmentPerfil;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        rvFragmentPerfil = v.findViewById(R.id.rvFragmentPerfil);

        rvFragmentPerfil.setLayoutManager(new GridLayoutManager(getActivity(),3));

/*
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvFragmentPerfil.setLayoutManager(llm);

 */
        inicializarListaMascotas();
        inicializarAdaptador();
        return v;
    }

    public PerfilAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new PerfilAdaptador(mascotas,getActivity());
        rvFragmentPerfil.setAdapter(adaptador);
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