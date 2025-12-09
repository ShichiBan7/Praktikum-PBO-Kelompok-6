/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_5;

/**
 *
 * @author LENOVO
 */
public class Jam {
    String merk;
    String tipe;   // analog / digital
    int harga;

    // Constructor 1 (default)
    Jam() {
        this.merk = "Casio";
        this.tipe = "Digital";
        this.harga = 250000;
    }

    // Constructor 2 (dengan parameter)
    Jam(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Method 1
    void info() {
        System.out.println("Jam merk: " + merk + ", Tipe: " + tipe + ", Harga: Rp" + harga);
    }

    // Method 2 (overloading, pakai nama pemakai)
    void info(String pemakai) {
        System.out.println(pemakai + " Memaikai = " + merk + " (" + tipe + ") seharga Rp" + harga);
    }
}  

