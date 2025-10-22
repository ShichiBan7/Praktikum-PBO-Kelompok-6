/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_7;

/**
 *
 * @author user
 */
public class Tugas_7 {
    
    public static void main(String[] args){
        Player player1 = new Player("Spider-Man", 100, 10);
        Enemy enemy1 = new Enemy("Venom", 75, 7);
        Goblin goblin1 = new Goblin("Green Goblin", 90, 9);
        Wizard wizard1 = new Wizard ("Wizard", 50, 10, 100);
        
//        player1.tampilkanInfo();
//        enemy1.tampilkanInfo();
//        goblin1.tampilkanInfo();
        wizard1.tampilkanInfo();
        
//        player1.attack(enemy1);
//        enemy1.attack(player1);
//        goblin1.attack(player1);
        wizard1.attack(enemy1);
        
       
        
    }
}
