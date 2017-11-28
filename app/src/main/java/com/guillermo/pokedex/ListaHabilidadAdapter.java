package com.guillermo.pokedex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.guillermo.pokedex.models.Habilidad;
import com.guillermo.pokedex.models.Pokemon;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import com.pokemon.pokedex.R;

public abstract class ListaHabilidadAdapter extends RecyclerView.Adapter<ListaHabilidadAdapter.ViewHolder> {

    private ArrayList<Pokemon> dataset;
    private Context context;

    public ListaHabilidadAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidad, parent, false);
        return new ViewHolder(view);
    }
/*
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon p = dataset.get(position);
        holder.nombreTextView.setText(p.getName());

        Glide.with(context)
                .load("http://pokeapi.co/media/sprites/pokemon/" + p.getNumber() + ".png")
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)

    }
*/
    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaHabilidad(ArrayList<Habilidad> listaHabilidad) {
      //  dataset.addAll(listaHabilidad);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView nombreTextView;

        public ViewHolder(View itemView) {
            super(itemView);


            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
        }
    }
}
