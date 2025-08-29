/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_praktikum2;

/**
 *
 * @author Herva Sulistia
 * * 2407110856
 */
public class PBO_Praktikum2 {

    public static void main(String[] args) {
        // Menampilkan Hello World!
        System.out.println("Hello World!");
        /*
         * Menampilkan Nama
        */
        System.out.println("Halo saya Herva Sulistia");
        
        int umur;
        umur = 19;
        
        String nama = "Herva Sulistia";
        
        System.out.println("Nama saya " + nama);
        System.out.println("Umur " + umur);
        
        int x = 1, y = 3, z = 5;
        System.out.println(x + " " + y + " " + z);
        
        double[] ipSemester = {3.75, 3.68};
        System.out.println("IP Semester 2 saya adalah : " + ipSemester[1]);
        
         int intSemester1 = (int) ipSemester[0];
        System.out.println("Nilai IP semester 1 integer : " + intSemester1);
        
        long nilaiSangatBesar = 3000000000L;
        int intNilaiSangatBesar = (int) nilaiSangatBesar;
        
        System.out.println("Nilai long sebelum dikonversi ke integer :  " + nilaiSangatBesar);
        System.out.println("Nilai long yang dikonversi ke integer :  " + intNilaiSangatBesar);
        
        final double pi = 3.14;
        // pi = 3.5;
        System.out.println("Nilai Pi :" + pi);
    }
}
