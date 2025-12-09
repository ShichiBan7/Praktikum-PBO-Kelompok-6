/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum_5;

/**
 *
 * @author Siti Nazira 
 */
public class Pratikum_5 {
    public static void main(String[] args) {
        
    Mobil mobilSaya = new Mobil ("Toyota", "Merah", 2025);
    Mobil mobilKedua = new Mobil ("Alpard", "Hitam", 2020);
    Mobil mobilKetiga = new Mobil ();

    Kalkulator cal = new Kalkulator ();
    System.out.println ("1+10 +" + cal.tambah (1, 10));
    System.out.println ("2.4 + 3.3 =" + cal.tambah (2.4, 3.3));
  
    }
}
