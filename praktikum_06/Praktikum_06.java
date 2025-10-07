 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_06;

/**
 *
 * @author Nabil
 */
public class Praktikum_6 {

    public static void main(String[] args) {
        produk p1 = new produk ("Laptop", 900000, 15);
        produk p2 = new produk ("Handphone", 1500000, 10);
        
        System.out.println ("Nama Produk 1: "+ p1.nama);
     //   System.out.println (p1.harga);
         
        System.out.println ("Harga: "+ p1.getHarga());
        
        p1.setHarga(7000000);
        System.out.println("Harga Baru untuk produk: " + p1.getHarga());
    
   //     p1.namaSupplier();
        p1.namaSupplierFix();
        p1.tampilkanInfo();
        p2.tampilkanInfo();
        
        produk.infoJumlahProduk();
    }
}
