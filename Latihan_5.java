/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_5;

/**
 *
 * @author LENOVO
 */
public class Latihan_5 {
    public static void main(String[] args) {
        Jam j1 = new Jam();  // constructor default
        Jam j2 = new Jam("Rolex", "Analog", 5000000);
        Jam j3 = new Jam("G-Shock", "Digital", 1200000);

        j1.info();
        j2.info("Zira");
        j3.info("Herva");
    }
}