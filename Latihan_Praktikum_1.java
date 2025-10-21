/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_praktikum_1;

/**
 *
 * @author LENOVO
 */

        
    public class mahasiswa {
    
// Konstanta
    public static final int JUMLAH_SEMESTER = 2;

    public static void main(String[] args) {
        // Data Mahasiswa
        String nama = "Herva Sulistia";
        String nim = "2407110856";
        int umur = 19;
        String golDarah = "B+";
        String alamat = "Jl. Kamboja";

        // IP tiap semester
        double[] ipSemester = new double[JUMLAH_SEMESTER];
        ipSemester[0] = 3.45;
        ipSemester[1] = 3.60;
        ipSemester[2] = 3.50;
        

        // Output data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Golongan Darah : " + golDarah);
        System.out.println("Alamat         : " + alamat);
        System.out.println("IP Tiap Semester:");
        
        for (int i = 0; i < JUMLAH_SEMESTER; i++) {
            System.out.println("Semester " + (i + 1) + ": " + ipSemester[i]);
        }
    }
}

 public class BiodataMahasiswa {

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama = "Herva Sulistia";
        String nim = "2407110856";
        double ip = 3.85;

        // Menampilkan output ke layar
        System.out.println("=== Biodata Mahasiswa ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IP   : " + ip);
    }
}



