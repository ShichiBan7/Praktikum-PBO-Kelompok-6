/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum_3;

/**
 *
 * @author Siti Nazira
 */
import java.util.Scanner;

    public class Pratikum_3 {
    public static void main(String[] args) {
        int a = 10, b = 2;

        // Operator Aritmatika
        System.out.println(" Tambah (+) : " + (a + b));
        System.out.println(" Kurang (-) : " + (a - b));
        System.out.println(" Kali (*)   : " + (a * b));
        System.out.println(" Bagi (/)   : " + (a / b));
        System.out.println(" Modulus (%) : " + (a % b));
        System.out.println("================================================================");
        
        // Operator Perbandingan
        System.out.println(" a == b : " + (a == b));
        System.out.println(" a != b : " + (a != b));
        System.out.println(" a > b  : " + (a > b));
        System.out.println(" a < b  : " + (a < b));
        System.out.println(" a >= b : " + (a >= b));
        System.out.println(" a <= b : " + (a <= b));
        System.out.println("===============================================================");

        
        // Operator Logika
        boolean x = true, y = false;
        System.out.println(" x && y : " + (x && y)); // and
        System.out.println(" x || y : " + (x || y)); // or
        System.out.println(" !x     : " + (!x));     // not
        System.out.println("===============================================================");

        // Operator Assignment
        int i = 10;
        i += 2;
        System.out.println(" i += 2 : " + i);
        System.out.println("===============================================================");
        
        // Operator Ternary
        int nilai = 40;
        char grade = (nilai >= 80) ? 'A' : (nilai >= 75) ? 'B' : (nilai >= 60) ? 'C' : 'D';
        System.out.println(" Grade : " + grade);
        System.out.println("===============================================================");
        
        // Output printf
        String nama = "zira";
        int umur = 19;
        double tinggi = 152.5f;
        System.out.printf("Halo saya %s, umur %d, tinggi %.1f cm%n", nama, umur, tinggi);
        

        // Input Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan NIM anda : ");
        String nim = scanner.nextLine();
        System.out.println("NIM anda adalah : " + nim);

        try {
            System.out.print("Masukkan umur : ");
            int umurUser = scanner.nextInt();
            System.out.println("Umur anda adalah : " + umurUser);
        } catch (Exception e) {
            System.out.println("Anda salah input");
        }
         System.out.println("===============================================================");

        // Wrapper Class
        String strUmur = "19";
        int intUmur = Integer.parseInt(strUmur);
        System.out.println("strUmur yang telah di konversi : " + intUmur);

        int value = 235;
        String strValue = Integer.toString(value);
        System.out.println("Nilai konversi ke String : " + strValue);
         System.out.println("==============================================================="); 
        
   //Emumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        Hari hariIni = Hari.RABU;
        
        if(hariIni == Hari.RABU){
            System.out.println("Hari ini adalah hari " + Hari.RABU);
            System.out.println("Besok adalah hari " + Hari.KAMIS);
        }
    }
}
