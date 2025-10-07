/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_06;

/**
 *
 * @author Nabil
 */
public class produk {
    public String nama;
    private double harga;
    protected int stok;
    
    private final String namaSupplier = "Nabil";
  
    //static variabel
    static int jumlahProduk = 0; 
    
    //Konstruktor
    public produk (String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }
   
    public double getHarga(){
    return harga;
    }
    
   public void setHarga(double hargaBaru){
    if (hargaBaru > 0) { 
        this.harga = hargaBaru;
   }
    else if (hargaBaru == 0) {
        this.harga = hargaBaru;
        System.out.println ("Produk ini gratis");
    }
  
    else {
        System.out.println ("Harga tidak boleh negatif");
    }
    
   } 
   
   public static void infoJumlahProduk(){
   System.out.println ("Total produk yang telah dibuat: " + jumlahProduk);
   
   }
 
   private void namaSupplier(){
    System.out.println ("Nama Supplier:  " +  namaSupplier);
   }
  
   public void namaSupplierFix (){
   namaSupplier ();
   
   }
   
   public void tampilkanInfo (){
    System.out.println ("Nama: " +  nama);
    System.out.println ("Harga: " +  harga);
    System.out.println ("Stok: " +  stok);
    
    
   
   } 
}
