/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_6;

/**
 *
 * @author LENOVO
 */
public class Bank {
    private String namaBank;
    private final String lokasiCabang;
    static int jumlahNasabah = 0;
    
    public Bank(String namaBank, String lokasiCabang){
        this.namaBank = namaBank;
        this.lokasiCabang = lokasiCabang;
    }
    
    public String getNamaBank(){
        return namaBank;
    }
    
    public String getLokasiBank(){
        return lokasiCabang;
    }
}

