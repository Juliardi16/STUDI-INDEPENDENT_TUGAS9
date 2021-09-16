package com.example.produkapp.model;

public class Toko {
    private String namaToko,Alamat;
    private String gambarToko;

    public Toko(String namaToko, String alamat, String gambar) {
        this.namaToko = namaToko;
        Alamat = alamat;
        this.gambarToko = gambar;
    }

    public Toko() {

    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getGambar() {
        return gambarToko;
    }

    public void setGambar(String gambar) {
        this.gambarToko = gambar;
    }
}
