/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_4;
import java.util.Scanner;
/**
 *
 * @author Nabil
 */
public class Praktikum_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print ("Masukkan nilai: ");
        int nilai = input.nextInt();
        if (nilai > 75){
            System.out.println ("Anda lulus ujian"); 
        }
        else {
        System.out.println ("Anda harus mengulang ujian");
        }
        
        System.out.print ("Masukkan warna (RGB): ");
        String warna = input.next();
        switch (warna){
            case "R":
                System.out.println ("Anda memilih warna merah ");
            case "G":
                System.out.println ("Anda memilih warna hijau ");
            case "B":
                System.out.println ("Anda memilih warna biru ");
            default:
                System.out.println ("Warna tidak tersedia ");
    }
        
        System.out.print ("Masukkan angka: ");
        int angka = input.nextInt();
        if (angka >= 0){
            System.out.print ("bilangan bernilai positif ");
            
            if (angka % 2 == 0){
                System.out.print ("dan genap");
            } else {
                System.out.print ("dan ganjil");
                
            }
         
        } else if (angka == 0) {
            System.out.print ("bilangan bernilai netral");
        } else {
            System.out.print ("bilangan bernilai negatif");
            
            if (angka % 2 == 0){
                System.out.print ("dan genap");
            } else {
                System.out.println ("dan ganjil");

            }
       
        }
        
        for (int a =1; a <=5; a++){
            System.out.println ("for loop ke-" + a);
        }
        
        int b =1;
        while (b <= 5){
            System.out.println ("while loop ke-" + b);
            b++;
        }
        
        int c = 6;
        do {
            System.out.println ("do whliw loop ke-" + c);
            c++;
        }while (c <= 5);
        
        char kursi = 'A';
        for (int i = 0; i < 3; i++ ){
            for (int j = 1; j < 5; j++ ){
                System.out.print(kursi + "" + j + " ");
            }
            System.out.println (); 
            kursi++;
        } 
        
        for (int d = 1; d <= 10; d++) {
            if (d == 5){
                System.out.println ("break di angka " + d);
                break;
                }  
                System.out.println ("Angka : " + d);
            }
         
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0){
                continue;
                }  
                System.out.println ("bilangan ganjil " + e);
            }
            
    }
    
}
