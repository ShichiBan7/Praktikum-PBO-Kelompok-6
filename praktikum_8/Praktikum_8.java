/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_8;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Praktikum_8 {

    public static void main(String[] args) {
        
        // JFrame
        JFrame frame = new JFrame("My First GUI");
        
        // Set Size
        frame.setSize(400, 300);
        
        //Mengatur operasi saat ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Frame terlihat
        frame.setVisible(true);
        
        // Agar muncul ditemgah
        frame.setLocationRelativeTo(null);
        
        JLabel label1 = new JLabel ("Contoh JLabel");
        frame.add(label1);
        
        //jTextField1 = new javax.swing.JTextField();
        
      
    }
}
