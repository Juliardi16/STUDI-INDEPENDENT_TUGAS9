package com.example.produkapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.produkapp.R;
import com.example.produkapp.Web;
import com.example.produkapp.model.HomeModel;

import java.util.ArrayList;

public class IkanAdapter extends RecyclerView.Adapter<IkanAdapter.IkanViewHolder> {
    private Context context;
    private ArrayList<HomeModel> listdata;

    public IkanAdapter (Context context){
        this.context = context;
    }

    public ArrayList<HomeModel> getListdata() {
        return listdata;
    }

    public void setListdata(ArrayList<HomeModel> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public IkanAdapter.IkanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_produk_ikan, parent, false );
        return new IkanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IkanAdapter.IkanViewHolder holder, int position) {
        HomeModel ikan = getListdata().get(position);
        holder.nama.setText(ikan.getNama());
        holder.warna.setText(ikan.getWarna());
        Glide.with(context)
                .load(ikan.getImg())
                .apply(new RequestOptions().override(700,393))
                .into(holder.gambar);

    }

    @Override
    public int getItemCount() {
        return getListdata().size();
    }
    class IkanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView gambar;
        TextView nama, warna;
        public IkanViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tv_nama);
            warna = itemView.findViewById(R.id.tv_warna);
            gambar = itemView.findViewById(R.id.gambarIkan);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Web.class);
                    context.startActivity(intent);
                }
            });


        }

        @Override
        public void onClick(View v) {

        }
    }
}
