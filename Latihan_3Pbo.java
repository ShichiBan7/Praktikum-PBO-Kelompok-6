/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_3pbo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan_3Pbo {
        
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
