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
        
        // Agar muncul ditengah
        frame.setLocationRelativeTo(null);
        
        JLabel label = new JLabel ("Contoh JLabel" , SwingConstants.CENTER);
        frame.add(label);
        
//        JTextField textField = new JTextField(20);
//        frame.add(textField);
//        
//        JButton button = new JButton ("New JButton");
//        frame.add(button);

    }
}
