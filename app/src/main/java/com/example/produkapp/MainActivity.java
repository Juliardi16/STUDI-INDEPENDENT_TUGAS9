package com.example.produkapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;


import com.example.produkapp.fragmentt.FragmentAkun;
import com.example.produkapp.fragmentt.FragmentHome;
import com.example.produkapp.fragmentt.FragmentProduk;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        bottom = findViewById(R.id.bottom_nav);
        bottom.setOnNavigationItemSelectedListener(this);


        tampil( new FragmentHome());
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage(" Mau Keluar ?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int i = item.getItemId();
        Fragment fragment = null;
        switch(i){
            case R.id.home:
                fragment = new FragmentHome();
                break;
            case R.id.produk:
                fragment = new FragmentProduk();
                break;
            case R.id.akun:
                fragment = new FragmentAkun();
                break;

        }
        return tampil(fragment);

    }

    private boolean tampil(Fragment fragment){

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
            return true;
        }
        return false;
    }

}