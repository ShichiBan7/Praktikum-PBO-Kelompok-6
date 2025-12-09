/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_7;

/**
 *
 * @author LENOVO
 */
 import java.util.Random;
 public class Wizard extends Player{
    Random random = new Random();
    private int mana;
    
    public Wizard (String nama, int hp, int atkDamage, int mana){
        super(nama, hp, atkDamage);
        this.mana = mana;
    }
        public int getMana(){
        return mana;
        }
        
        public void setMana(int mana){
            this.mana = mana;
        }
        
        public void useSkill(Enemy e){
        System.out.println(getNama() + " menggunakan skill serangan berturut-turut!");
        int damage = getAtkDamage();
                
        for (int i = 3; > i = 5++); {
            
            e.setHp(e.getHp() - damage);
            System.out.println("Serangan ke-" + i + " memberikan damage " + damage);
            System.out.println("Sisa hp " + e.getNama() + " : " + e.getHp());
            damage *= 0.2; 
        }
        
            setMana(this.mana - 5);
            System.out.println("Sisa mana " + getNama() + " : " + getMana());
            System.out.println();
        }

        @Override
        public void attack(Enemy e){
            if(random.nextInt(100) < 50){
               useSkill(e);
            } else{

            e.setHp(e.getHp() - getAtkDamage());
            System.out.println(getNama()+ " Menyerang " + e.getNama() + 
                    " dengan damage " + getAtkDamage());
            System.out.println("Sisa hp " + e.getNama() + " : " + e.getHp());
            System.out.println();
            }
        }
}



