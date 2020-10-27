package com.ness.petagram.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ness.petagram.pojo.Mascotas;
import com.ness.petagram.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascotas> mascotas;
    Activity            activity;
    public static int[] contador;
       


    public MascotaAdaptador(ArrayList<Mascotas> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }


    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_petagram, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, final int position) {
        final Mascotas mascota = mascotas.get(position);
        contador = new int[mascotas.size()];

        mascotaViewHolder.imgMascota.setImageResource(mascota.getImgMascota());
        mascotaViewHolder.txtvnombre.setText(mascota.getNombre());
        mascotaViewHolder.txtvVotos.setText(Integer.toString(contador[position]));

        String A =   mascota.setTxtvVotos(Integer.toString(contador[position]));
        mascotaViewHolder.txtvVotos.setText(A);


        mascotaViewHolder.imgbtnHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador[position] = contador[position] + 1;
                Toast.makeText(activity, "Votaste por " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
                mascotaViewHolder.txtvVotos.setText(Integer.toString(contador[position]));
            }
        });


    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView   imgMascota;
        private TextView    txtvnombre;
        private ImageButton imgbtnHueso;
        private TextView    txtvVotos;

        public MascotaViewHolder(@NonNull View itemView){
            super(itemView);

            imgMascota  = (ImageView)   itemView.findViewById(R.id.imgMascota);
            txtvnombre  = (TextView)    itemView.findViewById(R.id.txtvNombre);
            imgbtnHueso = (ImageButton) itemView.findViewById(R.id.imgbtnHueso);
            txtvVotos   = (TextView)    itemView.findViewById(R.id.textvVotos);

        }
    }
}
