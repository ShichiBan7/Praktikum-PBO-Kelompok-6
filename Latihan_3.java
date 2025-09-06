/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_3;

/**
 *
 * @author Siti Nazira
 */
import java.util.Scanner;

public class Latihan_3 {
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);  
       
        final double PI = 3.14;
    
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
