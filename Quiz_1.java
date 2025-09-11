/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz_1;
import java.util.Scanner;
/**
 *
 * @author Nabil
 */
public class Quiz_1 {

        enum Warna {
        MERAH, HIJAU, BIRU
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // No 1
        String nama = "Wan Nabil Muzakhy";
        int umur = 19;
        System.out.println("Nama Saya: " + nama);
        System.out.println("Umur Saya: " + umur);

        // No 4
        System.out.print("Masukkan Nama Siswa: ");
        String namaSiswa = input.nextLine();
        System.out.println("Halo, " + namaSiswa + ", Selamat Belajar Java!");

        // No 6
        Warna warnaIni = Warna.MERAH;

        if (warnaIni == Warna.MERAH) {
            System.out.println("Warna Darah Adalah " + Warna.MERAH);
            System.out.println("Warna Daun Adalah " + Warna.HIJAU);
            System.out.println("Warna Laut Adalah " + Warna.BIRU);
        }

        // No 10
        System.out.println("Daftar Nilai");
        double total = 0;
        boolean tidakLulus = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + i + ": ");
            String mahasiswa = input.nextLine();

            System.out.print("Masukkan Nilai " + mahasiswa + ": ");
            double nilai = input.nextDouble();
            input.nextLine();

            System.out.println(mahasiswa + " mendapat nilai: " + nilai);

            total += nilai;
            if (nilai < 60) {
                tidakLulus = true;
            }
        }

        double rataRata = total / 5;
        System.out.println("Rata-rata nilai: " + rataRata);

        if (tidakLulus) {
            System.out.println("Ada mahasiswa tidak lulus.");
        }
    }
}
