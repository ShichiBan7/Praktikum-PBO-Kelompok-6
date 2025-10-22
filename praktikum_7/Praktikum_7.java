/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_7;

/**
 *
 * @author Nabil
 */
public class Praktikum_7 {

    public static void main(String[] args) {
      Produk p1 = new Produk ("Buku ", 150000);
      BarangElektronik p2 = new BarangElektronik ("Mouse ", 150000, 12);  
      p1.tampilkanInfo();
        System.out.println ("Pajak Produk Umum: " + p1.hitungPajak());
        System.out.println ("Hasil Akhir Produk: " + p1.hitungPajak());
        System.out.println("=".repeat(50));
      
      p2.tampilkanInfo();
      p2.tampilkanGaransi();
        System.out.println ("Pajak Barang Elektronik: " + p2.hitungPajak());
        System.out.println ("Hasil Akhir Produk: " + p2.hitungHarga());
        
        //BarangElektronik laptop = new BarangElektronik ("Laptop",1200000, 12);
           // laptop.tampilkanInfo;
            //laptop.tampilkanGaransi();
                
        
        
    }
}
