package com.mycompany.pbo_praktikum3;

import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args){
        final double PI = 3.14;
        
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Jari-jari (cm) : ");
            double jari = scanner.nextDouble();
            double volume = PI * jari * jari * jari * 4 / 3 ;
            System.out.print("Volume Bola adalah " + volume + " cm^3");
        } catch (Exception e) {
            System.out.println("Mohon masukkan angka");
        }
    }
}
