package com.example.produkapp.model;

public class HomeModel {
    private String nama;
    private String warna;
    private String img;

    public HomeModel(String nama, String warna, String img) {
        this.nama = nama;
        this.warna = warna;
        this.img = img;
    }

    public HomeModel() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
