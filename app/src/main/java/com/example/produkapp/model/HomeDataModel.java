package com.example.produkapp.model;

import java.util.ArrayList;

public class HomeDataModel {
    public static  String [][]data = new String[][]{
            {
                    "Ikan Mas Koki",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x312/cdn-cas.orami.co.id/parenting/images/photo_orig_24df8edbfc67c418c59da0aa99071b2c29a.width-800.jpg"
            },
            {
                    "Ikan Komet",
                    "",
                    "https://cdnt.orami.co.id/unsafe/468x344/cdn-cas.orami.co.id/parenting/images/ikan-komet-7.width-800.jpg"
            },
            {
                    "Ikan Black Ghost",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x321/cdn-cas.orami.co.id/parenting/images/blackghost-knifefish-si-ikan-hantu-berwarna-hi.width-800.png"
            },
            {
                    "Ikan Guppy",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x311/cdn-cas.orami.co.id/parenting/images/how_do_guppy_fish_reproduce_2688_orig.width-800.jpg"
            },
            {
                    "Ikan Lemon",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x312/cdn-cas.orami.co.id/parenting/images/dsc_01_9aba379ce1.width-800.jpg"
            },
            {
                    "Ikan Cupang",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x264/cdn-cas.orami.co.id/parenting/images/betta_fish_home_1.width-800.jpg"
            },
            {
                    "Ikan Neon Tetra",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x312/cdn-cas.orami.co.id/parenting/images/1200-47794658-neon-tetra-colored-fish.width-800.jpg"
            },
            {
                    "Ikan Botia",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x293/cdn-cas.orami.co.id/parenting/images/1200px-botia_striata.width-800.jpg"
            },
            {
                    "Ikan Manfish",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x311/cdn-cas.orami.co.id/parenting/images/ikan_manfish.width-800.jpg"
            },
            {
                    "Ikan Molly",
                    " ",
                    "https://cdnt.orami.co.id/unsafe/468x335/cdn-cas.orami.co.id/parenting/images/molly-fry-tropical-fish-58da6ae0b385e.width-800.jpg"
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
