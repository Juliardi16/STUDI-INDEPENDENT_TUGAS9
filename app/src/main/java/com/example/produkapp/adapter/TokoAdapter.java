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
import com.example.produkapp.model.DataToko;
import com.example.produkapp.model.HomeModel;
import com.example.produkapp.model.Toko;

import java.util.ArrayList;

public class TokoAdapter extends RecyclerView.Adapter<TokoAdapter.TokoViewHolder> {

    private Context context;
    private ArrayList<Toko> listToko;

    public TokoAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Toko> getListToko() {
        return listToko;
    }

    public void setListToko(ArrayList<Toko> listToko) {
        this.listToko = listToko;
    }


    @NonNull
    @Override
    public TokoAdapter.TokoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_toko_ikan, parent, false );
        return new TokoAdapter.TokoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokoAdapter.TokoViewHolder holder, int position) {
        Toko toko = getListToko().get(position);
        holder.nama.setText(toko.getNamaToko());
        holder.alamatToko.setText(toko.getAlamat());
        Glide.with(context)
                .load(toko.getGambar())
                .apply(new RequestOptions().override(700,393))
                .into(holder.gambar);

    }

    @Override
    public int getItemCount() {
        return getListToko().size();
    }
    class TokoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView gambar;
        TextView nama, alamatToko;
        public TokoViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaToko);
            alamatToko = itemView.findViewById(R.id.alamat);
            gambar = itemView.findViewById(R.id.gambarToko);

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
