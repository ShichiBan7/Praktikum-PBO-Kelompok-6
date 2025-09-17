/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_05;

/**
 *
 * @author Nabil
 */
public class Tugas_05 {

    public static void main(String[] args) {
        Smartphone smartphoneSaya = new Smartphone();
        smartphoneSaya.tampilkanInfo("Ini Smartphone Saya");
            System.out.println("=".repeat(50));
        
        Smartphone smartphoneOrang = new Smartphone("Xiaomi", 14); 
        smartphoneOrang.tampilkanInfo(); 
            System.out.println("=".repeat(50));
         
        Smartphone smartphoneTeman = new Smartphone("Iphone",14, 9000000); 
        smartphoneTeman.tampilkanInfo("Smartphone Teman");
            System.out.println("=".repeat(50));
    }
}
