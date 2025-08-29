/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_praktikum2;

/**
 *
 * @author LENOVO
 */

public class Latihan_praktikum2 {
    public static void main(String[] args) {

        // Menyimpan dan menampilkan nama
        String nama = "Herva Sulistia";
        System.out.println("Nama: " + nama);

        // Menyimpan dan menampilkan NIM
        final long NIM = 2407110856L;
        System.out.println("NIM: " + NIM);

        // Menyimpan dan menampilkan alamat
        String alamat = "Jl. Kamboja";
        System.out.println("Alamat: " + alamat);

        // Menyimpan dan menampilkan umur
        int umur = 19;
        System.out.println("Umur: " + umur + " tahun");

        // Menyimpan dan menampilkan golongan darah
        char golonganDarah = 'O';
        System.out.println("Golongan Darah: " + golonganDarah);

        // Menyimpan IP tiap semester dalam array
        double[] ipSemester = {3.72, 3.68};  // IP semester 1 dan 2
        System.out.println("\n=== IP Tiap Semester ===");
        System.out.println("IP Semester 1: " + ipSemester[0]);
        System.out.println("IP Semester 2: " + ipSemester[1]);

        // Konversi IP semester 1 ke tipe data byte
        byte ipByte = (byte) ipSemester[0];  // Akan membuang bagian desimal
        System.out.println("\nIP Semester 1 dalam bentuk byte: " + ipByte);
        
       
    }
}
