package com.example.produkapp.model;

import java.util.ArrayList;

public class HomeDataModel {
    public static  String [][]data = new String[][]{
            {
                    "Komet",
                    "kuning",
                    "https://hewanee.com/wp-content/uploads/2020/07/Ikan-Komet.jpg"
            },
            {
                    "koi",
                    "kuning",
                    "https://cdn-2.tstatic.net/jabar/foto/bank/images/ikan-hias_20170814_091452.jpg"
            },
            {
                    "cupang",
                    "Biru merah",
                    "https://cdns.klimg.com/merdeka.com/i/w/news/2020/05/28/1181306/540x270/4-jenis-ikan-cupang-mahal-yang-cocok-untuk-dipelihara.jpg"
            },
            {
                    "gupy",
                    "biru",
                    "https://www.ruparupa.com/blog/wp-content/uploads/2020/12/Screen-Shot-2020-12-04-at-12.37.49.png"
            },
            {
                    "neon fish",
                    "biru",
                    "https://asset.kompas.com/crops/Kmwyf5qpXo9o0ng5VOTitSfDkik=/50x34:450x300/750x500/data/photo/2020/11/05/5fa40c4b75c02.jpg"
            },
            {
                    "arwana",
                    "merah",
                    "https://www.ruparupa.com/blog/wp-content/uploads/2021/04/Screen-Shot-2021-04-01-at-23.23.32.png"
            },
    };
    public static ArrayList<HomeModel> getlistData(){
        ArrayList<HomeModel> list = new ArrayList<>();
        for(String []dataa : data){
            HomeModel home = new HomeModel();
            home.setNama(dataa[0]);
            home.setWarna(dataa[1]);
            home.setImg(dataa[2]);
            list.add(home);
        }
        return list;
    }
}
