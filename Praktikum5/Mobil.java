package com.mycompany.pbo_praktikum5;

public class Mobil {
    String merk;
    String warna;
    int tahunKeluar;
    
    public Mobil(){
        this.merk = "Unknown";
        this.warna = "Putih";
        this.tahunKeluar = 2010;
    }
    
    public Mobil(String merk, String warna, int tahunKeluar){
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluar = tahunKeluar;
    }

    public void panaskanMobil(){
        System.out.println("Mobil sedang dipanaskan");
    }
}
