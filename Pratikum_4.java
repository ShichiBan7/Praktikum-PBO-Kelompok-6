/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum_4;

import java.util.Scanner;

/**
 *
 * @author Siti Nazira
 */
public class Pratikum_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        if (nilai > 75) {
            System.out.println("Anda lulus ujian");
        } else if (nilai > 65) {
            System.out.println("Nilai anda berada di ambang batas kelulusan");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }

        // Input warna
        System.out.print("Masukkan warna (RGB) : ");
        String warna = input.next();
        switch (warna) {
            case "R":
                System.out.println("Anda memilih warna merah");
                break;
            case "G":
                System.out.println("Anda memilih warna hijau");
                break;
            case "B":
                System.out.println("Anda memilih warna biru");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }

        // Input angka
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.print("Bilangan bernilai positif ");
        } else if (angka == 0) {
            System.out.print("Bilangan bernilai netral ");
        } else {
            System.out.print("Bilangan bernilai negatif ");
        }

        // Cek ganjil genap
        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        } else {
            System.out.println();
        }

        // For loop
        for (int a = 1; a <= 5; a++) {
            System.out.println("For Loop ke- " + a);
        }

        // While loop
        int b = 1;
        while (b <= 5) {
            System.out.println("While Loop ke- " + b);
            b++;
        }

        // Do while loop
        int c = 6;
        do {
            System.out.println("Do while Loop ke- " + c);
            c++;
        } while (c <= 5);

        // Nested loop (kursi)
        char kursi = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(kursi + "" + j + " ");
            }
            System.out.println();
            kursi++;
        }

        // Break
        for (int d = 1; d <= 10; d++) {
            if (d == 5) {
                System.out.println("Break di angka " + d);
                break;
            }
            System.out.println("Angka " + d);
        }

        // Continue
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0) {
                continue;
            }
            System.out.println("Bilangan ganjil: " + e);
        }
    }
}