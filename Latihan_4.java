/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_4;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan_4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String pilih;
       System.out.println("Program menghitung luas bangun datar");
       System.out.println("1. Persegi");
       System.out.println("2. Persegi Panjang");
       System.out.println("3. Lingkaran");
       System.out.println("4. Segitiga");
       System.out.println("5. Keluar");
       
       do{
           System.out.println("=========================================");
           System.out.print("Pilihan anda (1-5) : ");
           pilih = input.next();
           switch (pilih) {
               
              
               case "1":
                   System.out.println("Menghitung luas Persegi");
                   System.out.print("Masukkan panjang sisi (cm) : ");
                   double sisi = input.nextDouble();
                   double luasPersegi = sisi * sisi;
                   System.out.println("Luas Persegi : " + luasPersegi + " cm^2");
                   break;
                   
               case "2":
                   System.out.println("Menghitung luas Persegi Panjang");
                   System.out.print("Masukkan panjang sisi (cm) : ");
                   double panjang = input.nextDouble();
                   System.out.print("Masukkan lebar sisi (cm) : ");
                   double lebar = input.nextDouble();
                   double luasPersegiPanjang = panjang * lebar;
                   System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang + " cm^2");
                   break;
                   
               case "3":
                   System.out.println("Menghitung luas Lingkaran");
                   System.out.print("Masukkan panjang jari-jari (cm) : ");
                   double jari = input.nextDouble();
                   final double PI = (jari %7 == 0) ? (22.0 / 7) : 3.141;
                   double luasLingkaran = PI * jari * jari;
                   System.out.println("Luas Lingkaran : " + luasLingkaran + " cm^2");
                   break;
                   
               case "4":
                   System.out.println("Menghitung luas Segitiga");
                   System.out.print("Masukkan panjang alas (cm) : ");
                   double alas = input.nextDouble();
                   System.out.print("Masukkan tinggi (cm) : ");
                   double tinggi = input.nextDouble();
                   double luasSegitiga = alas * tinggi / 2;
                   System.out.println("Luas Segitiga : " + luasSegitiga + " cm^2");
                   break;
                   
               case "5":
                   System.out.println("Terimakasih sudah menggunakan kalkulator");
                   break;
               default:
                   System.out.println("Input tidak valid");
                     }
               } while (!"5".equals(pilih));
    }  
}

    

