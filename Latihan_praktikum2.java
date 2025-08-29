/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_praktikum2;

/**
 *
 * @author Naufal Huseini 2407114249
 */
public class Latihan_praktikum2 {
    public static void main(String[] args){
        String nama = "Naufal Huseini";
        final long NIM = 2407114249L;
        int umur = 19;
        char golonganDarah = 'O';
        String alamat = "Jalan. Abadi";
        double[] ipSemester = {3.75, 3.68, 3.70, 1.1234567890123458};
        float mfloat = (float) 1.1234567;
        
        byte bytesemester1 = (byte) ipSemester[0];
        
        System.out.println("Halo nama saya " + nama);
        System.out.println("Dengan NIM : " + NIM);
        System.out.println("Saya berumur " + umur + " tahun");
        System.out.println("Golongan darah saya adalah " + golonganDarah);
        System.out.println("Saya tinggal di " + alamat);
        System.out.println("IPK Semester 1 saya adalah : " + ipSemester[0]);
        System.out.println("Nilai IP semester 1 byte : " + bytesemester1);
        System.out.println(ipSemester[3]);
        System.out.println(mfloat);
    }
}

