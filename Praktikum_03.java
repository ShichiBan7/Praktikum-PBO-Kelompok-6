/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_03;
import java.util.Scanner;

/**
 *
 * @author Nabil
 */
public class Praktikum_03 {

    public static void main(String[] args) {
        int a = 5, b = 8;
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Operator Aritmetika
        System.out.println("Tambah (+) " + (a + b));
        System.out.println("Kurang (-) " + (a - b));
        System.out.println("Kali (*) " + (a * b));
        System.out.println("Bagi (/) " + (a / b));
        System.out.println("Modulus (%) " + (a % b));
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Operator Perbandingan
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Operator Logika
        boolean x = true, y = false;
        System.out.println("x && y :" + (x && y));
        System.out.println("x || y :" + (x || y));
        System.out.println(" !x: " + (!x));
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Operator Assignment
        int i = 10;
        i += 2;
        System.out.println("i += 2: " + i);
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Operator Ternary
        int nilai = 80;
        char grade = (nilai >= 80) ? 'A' : (nilai >= 75) ? 'B' : (nilai >= 60) ? 'C' : 'D';
        System.out.println ("Grade : " + grade);
               
        System.out.println("=".repeat(50));  // 50 kali tanda '='
       
        // I/O
        // Output printf
        String nama = "Nabil";
        int umur = 19;
        double tinggi = 170.5f;
        
        System.out.printf("Halo nama saya %s, umur %d, tinggi %.1f cm%n", nama, umur, tinggi);
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Input Scanner
        Scanner scanner = new Scanner (System.in);
        System.out.print( "Masukkan NIM anda : " );
        
        // User Input
        String nim = scanner.nextLine();
        System.out.println( "NIM anda adalah : " + nim );
        
        try{
        System.out.print( "Masukkan umur anda : " );
        int umurUser = scanner.nextInt();
        System.out.println( "Umur anda adalah : " + umurUser );
        }catch (Exception e) {
        System.out.println ("Anda salah input");
        }
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        // Wrapper Class
        String strUmur = "19";
        int intUmur = Integer.parseInt(strUmur);
        System.out.println( "Umur yang telah dikonvresi : " + intUmur );
        
        int value = 235;
        String strValue = Integer.toString(value);
        System.out.println( "Nilai Konversi ke string : " + strValue );
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        //enumerasi
        enum Hari{
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        Hari hariIni= Hari.RABU;
        
        if  (hariIni == Hari.RABU) {
        System.out.println ("Hari ini adalah hari: " + Hari.RABU);
        System.out.println ("Besok adalah hari: " + Hari.KAMIS);
        
        System.out.println("=".repeat(50));  // 50 kali tanda '='

        }
    }
}
