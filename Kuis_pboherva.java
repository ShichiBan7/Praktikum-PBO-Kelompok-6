/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuis_pboherva;
import java.util.Scanner;
/**
 *
 * @author Herva Sulistia
 */
public class Kuis_pboherva {

    public static void main(String[] args) {
        /*
         * soal 1
        */
        String nama = "Herva Sulistia";
        int umur;
        umur = 19;
        
        System.out.println("Nama saya " + nama);
        System.out.println("Umur " + umur);
        
        /*
         * soal 3
        */
        final int SKS_MINIMAL = 12;
        final int SKS_MAKSIMAl = 24;
        
        System.out.println("Jumlah SKS minimal: " + SKS_MINIMAL);
        System.out.println("Jumlah SKS maksimal: " + SKS_MAKSIMAl);
        /*
         * soal 7 no 2
        */
         final double PI = 3.14;
        
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Jari-jari (cm) : ");
            double jari = scanner.nextDouble();
            double luas = PI * jari * jari ;
            System.out.print("Luas lingkaran adalah " + luas + " cm^2");
        } catch (Exception e) {
            System.out.println("Mohon masukkan angka");
        }
        
        /*
         * soal 6
        */
        enum Warna {
        MERAH, HIJAU, BIRU
       }
        System.out.println("Pilihan warna:");
        String warna = input.next();
        switch (warna) {
            case "MERAH" -> System.out.println("Anda memilih warna merah");
            case "HIJAU" -> System.out.println("Anda memilih warna hijau");
            case "BIRU" -> System.out.println("Anda memilih warna biru");
            default -> System.out.println("Warna tidak tersedia");
        }
        
        /*
         * soal 2
        */
            int totalBelanja = 50000;
            int diskonPersen = 10;

            int Diskon = totalBelanja * diskonPersen / 100;
            int totalBayar = totalBelanja - Diskon;

            System.out.println("Total belanja Rp" + totalBelanja);
            System.out.println("Diskon " + "%" + diskonPersen);
            System.out.println("Total bayar Rp" + totalBayar);
       
            
            /*
             * soal 4
            */
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan nama anda : ");
            String nama = scanner.nextLine();
            System.out.println("Halo, selamat belajar Java : " + nama );
    }
    
            int totalkas = 1000000;
            

          
       
  
}

        
        
        
        
        
      

  