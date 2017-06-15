package com.example.marwah.ensiklopedia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PencarianAdapter extends RecyclerView.Adapter<PencarianAdapter.MyViewHolder>{

    private List<String> listJudul;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView judul;

        public MyViewHolder(View view) {
            super(view);
            judul = (TextView) view.findViewById(R.id.text_judul_cari);
        }
    }

    public PencarianAdapter(List<String> listJudul) {
        this.listJudul = listJudul;
    }

    @Override
    public PencarianAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_pencarian, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PencarianAdapter.MyViewHolder holder, int position) {
        String judul = listJudul.get(position);
        holder.judul.setText(judul);
    }

    @Override
    public int getItemCount() {
        return listJudul.size();
    }
}
