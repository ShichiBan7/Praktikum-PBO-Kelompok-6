/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_02;

/**
 *
 * @author Nabil
 */
public class Tugas_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Nama
        //String
        String nama = "Wan Nabil Muzakhy";           
        
        //NIM
        //long
        long nimSaya = 2407127390L;
        
        //Golongan Darah
        //char
        //Konstanta
        final char GOLDA ='O';
        
        //Umur
        int umur = 19;
        
        //IP
        //double + array
        //Konversi
        double[] ipSemester = {3.9, 3.7, 4.0};
        byte ipDiperkecil = (byte) ipSemester[2];
        
       System.out.println("Nama Saya : " + nama);
       System.out.println("NIM Saya  : " + nimSaya);
       System.out.println("Golongan Darah Saya  : " + GOLDA);
       System.out.println("Umur  : " + umur);
       System.out.println("IP Semester 1 saya adalah : " + ipSemester[0]);
       System.out.println("IP Semester 2 saya adalah : " + ipSemester[1]);
       System.out.println("IP Semester 3 saya adalah : " + ipSemester[2]);
       System.out.println("IP Konversi : " +  ipDiperkecil);
         
    }
}
