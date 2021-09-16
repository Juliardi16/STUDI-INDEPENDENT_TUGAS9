package com.example.produkapp.fragmentt;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.produkapp.Login;
import com.example.produkapp.R;
import com.example.produkapp.adapter.IkanAdapter;
import com.example.produkapp.adapter.TokoAdapter;
import com.example.produkapp.model.DataToko;
import com.example.produkapp.model.HomeDataModel;
import com.example.produkapp.model.HomeModel;
import com.example.produkapp.model.Toko;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private final ArrayList<Toko> list = new ArrayList<>();

    public FragmentHome() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_home,container,false);
        recyclerView = view.findViewById(R.id.rcview);
        recyclerView.setHasFixedSize(true);

        list.addAll(DataToko.getListToko());
        showData();

        return view;

    }

    public void showData(){
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        TokoAdapter toko = new TokoAdapter(this.getContext());
        toko.setListToko(list);
        recyclerView.setAdapter(toko);
    }


}
