package com.example.produkapp.model;

import java.util.ArrayList;

public class DataToko {
    public static String [][]data = new String[][]{

            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },
            {
                    "Toko Ikan hias sumenep",
                    "Jl.Sumenep jakarta",
                    "https://2.bp.blogspot.com/-5b8TsylR5ds/WOBb4WRpm9I/AAAAAAAAJ-E/7SzgHfLnReMAzbN4IYy8O49QNDirohYRwCLcB/s1600/Screenshot_1.jpg"
            },


    };

    public static ArrayList<Toko> getListToko(){
        ArrayList<Toko> listToko = new ArrayList<>();
        for(String []dataList : data){
           Toko toko = new Toko();
           toko.setNamaToko(dataList[0]);
           toko.setAlamat(dataList[1]);
           toko.setGambar(dataList[2]);
           listToko.add(toko);

        }
        return listToko;
    }
}
