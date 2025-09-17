/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_05;

/**
 *
 * @author Nabil
 */

public class Smartphone {
    String merk;
    int series;
    double harga;
   
    public Smartphone(){
        this.merk = "Infinix";
        this.series = 30;
        this.harga = 3000000;
    }
    
    public Smartphone(String merk, int series){
            this.merk = merk;
            this.series = series;
            this.harga = 5000000;
    } 
    
    public Smartphone(String merk, int series, double harga) {
        this.merk = merk;
        this.series = series;
        this.harga = harga;
    }

    public void tampilkanInfo() {
    System.out.println("Merk: " + merk);
    System.out.println("Series: " + series);
    System.out.println("Harga: Rp" + harga);
    }
    
    public void tampilkanInfo(String ket) {
    System.out.println("Merk: " + merk);
    System.out.println("Series: " + series);
    System.out.println("Harga: Rp" + harga);
    System.out.println("Keterangan: " + ket);
    }

}
