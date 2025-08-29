/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_2;

/**
 *
 * @author Siti Nazira
 */
public class Tugas_2 {

    public static void main(String[] args) {
    
    // menampilkam Nama dan data
        String nama = "Siti Nazira";
        String nim = "2407110007";
       
        double[] ipSemester = {3.45, 3.60, 4.00}; // minimal 2 semester
        String alamat = "Jl. Kutilang Sakti No.07, Pekanbaru";
        String UNIVERSITAS = "Universitas Riau"; // variabel konstanta
        int umur = 19;
        char golonganDarah = 'O';

    
        // Tampilkan data
        System.out.println("--- Data Diri ---");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);

         // Konversi 1 nilai IP ke tipe data byte
        byte ipByte = (byte) ipSemester[1]; // hanya ambil IP semester pertama
        
        System.out.print("IP Semester : ");
        for (int i =0; i < ipSemester.length; i++) {
            System.out.print(ipSemester[i] + " ");
        }
        System.out.println();

        System.out.println("Alamat        : " + alamat);
        System.out.println("Universitas   : " + UNIVERSITAS);
        System.out.println("Umur          : " + umur);
        System.out.println("Golongan Darah: " + golonganDarah);
        System.out.println("IP ke Byte    : " + ipByte);
    }
}
