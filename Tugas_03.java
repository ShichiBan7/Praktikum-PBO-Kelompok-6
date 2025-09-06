/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_03;

/**
 *
 * @author Nabil
 */
import java.util.Scanner;

public class Tugas_03 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    final double pi = 3.14;
    
    try{
        
        System.out.print("jari-jari (cm): ");
        double jari = scanner.nextDouble();

        double volume = pi * jari * jari * jari * 4/3;
        System.out.println("Volume Bola adalah : " + volume +" cm^3");
        
        }catch (Exception e) {
        System.out.println ("Mohon masukkan angka ! : ");
        }
    
    
        
    }
}
