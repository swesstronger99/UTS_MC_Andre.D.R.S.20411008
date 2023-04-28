package com.example.conter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<ItemData> itemData;

    public MyAdapter(ArrayList<ItemData> itemData) {
        this.itemData = itemData;
    }

    public MyAdapter(MyAdapter adapter) {

    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.nama_game.setText(itemData.get(position).getNama_game());
        holder.logo_game.setImageResource(itemData.get(position).getLogo_game());

    }

    @Override
    public int getItemCount() {
        return itemData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nama_game;
        ImageView logo_game;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama_game = itemView.findViewById(R.id.nama_game);
            logo_game = itemView.findViewById(R.id.logo_game);
        }
    }
}

