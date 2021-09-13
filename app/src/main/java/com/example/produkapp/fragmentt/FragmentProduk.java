package com.example.produkapp.fragmentt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.produkapp.R;
import com.example.produkapp.adapter.IkanAdapter;
import com.example.produkapp.model.HomeDataModel;
import com.example.produkapp.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentProduk extends Fragment  {
    View view;
    private RecyclerView recyclerView;
    private ArrayList<HomeModel> list = new ArrayList<>();

    public FragmentProduk(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_produk,container,false);
        recyclerView = view.findViewById(R.id.rc_view);
        recyclerView.setHasFixedSize(true);

        list.addAll(HomeDataModel.getlistData());
        showData();

        return view;
    }

    public void showData(){
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        IkanAdapter ikan = new IkanAdapter(this.getContext());
        ikan.setListdata(list);
        recyclerView.setAdapter(ikan);
    }

}

