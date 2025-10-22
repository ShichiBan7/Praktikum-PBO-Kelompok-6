/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_7;

import java.util.Random;

/**
 *
 * @author user
 */
public class Goblin extends Enemy{
    Random random = new Random();
    
    public Goblin(String nama, int hp, int atkDamage){
        super(nama, hp, atkDamage);
    }
    
    @Override
    public void attack(Player p){
        int totalDamage = getAtkDamage();
        if(random.nextInt(100) < 5){
            totalDamage *= 2;
            System.out.println(getNama() + " melakukan critical hit!!!");
        }
        
        p.setHp(p.getHp() - totalDamage);
        System.out.println(getNama() + " Menyerang " + p.getNama() + " dengan damage " + totalDamage);
        System.out.println("Sisa hp " + p.getNama() + " : " + p.getHp());
        System.out.println();
    }
}
