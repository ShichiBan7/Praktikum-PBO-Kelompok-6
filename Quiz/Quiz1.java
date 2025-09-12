
package com.mycompany.pbo_praktikum4;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       //No 9
    int pilih;   
       do{
    System.out.println("Program menghitung luas bangun datar \n1. Persegi\n2. Lingkaran\n3. Segitiga\n4. Keluar");
    System.out.print("Pilihan anda (1-4) : ");
    pilih = input.nextInt();
    switch (pilih) {  
        case 1:
            System.out.println("Menghitung luas Persegi");
            System.out.print("Masukkan panjang sisi :");
            double sisi = input.nextDouble();
            System.out.println("Luas Persegi : " + (sisi * sisi) + " cm^2");
            break;
        case 2:
            System.out.println("Menghitung luas Lingkaran");
            System.out.print("Masukkan panjang jari-jari :");
            double jari = input.nextDouble();
            System.out.println("Luas Lingkaran : " + (3.14 * jari * jari) + " cm^2");
            break;
        case 3:
            System.out.println("Menghitung luas Segitiga");
            System.out.print("Masukkan panjang alas :");
            double alas = input.nextDouble();
            System.out.print("Masukkan panjang tinggi :");
            double tinggi = input.nextDouble();
            System.out.println("Luas Segitiga : " + (alas * tinggi / 2) + " cm^2");
            break;
        case 4:
            System.out.println("Berhasil Keluar");
            break;
        default:
            System.out.println("Input tidak valid");  
            } 
       } while (pilih != 4);
       
       //No 4
       System.out.print("Masukkan nama : ");
       String nama = input.next();
       System.out.println("Halo, " + nama + ", Selamat belajar Java!");
        }
    }
  
