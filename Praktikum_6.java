/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_6;

/**
 *
 * @author LENOVO
 */
public class Praktikum_6 {
    public static void main(String[] args) {
        Produk p1 = new Produk ("Laptop", 9000000, 5);
        Produk p2 = new Produk ("HP", 3500000, 10);
        
        System.out.println ("Nama produk 1 : "+p1.nama);
      //System.out.println (p1.stok);
      //System.out.println (p1.harga);//ini akan eror
      
        System.out.println ("Harga :"+p1.getHarga());
        
        p1.setHarga (7000000);
        System.out.println ("Harga baru untuk produk 1 :" +p1.getHarga ());
        
        //p1.namaSuppiler ();//ini akan eror
        p1.namaSupplierFix ();
        p1.tampilkanInfo ();
        
        
        p2.tampilkanInfo ();
        
        Produk.infoJumlahProduk ();
        
        
    }
}




