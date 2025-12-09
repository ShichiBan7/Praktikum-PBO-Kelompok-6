/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_7;

/**
 *
 * @author LENOVO
 */
public class Enemy {
    private String nama;
    private int hp;
    private int atkDamage;

    public Enemy(String nama, int hp, int atkDamage) {
        this.nama = nama;
        this.hp = hp;
        this.atkDamage = atkDamage;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAtkDamage() {
        return this.atkDamage;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtkDamage(int atkDamage) {
        this.atkDamage = atkDamage;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama Musuh    : " + this.nama);
        System.out.println("Hp Musuh      : " + this.hp);
        System.out.println("Attack Damage : " + this.atkDamage);
        System.out.println();
    }
    
    public void attack(Player p){
        p.setHp(p.getHp() - this.atkDamage);
        System.out.println(this.nama + " Menyerang " + p.getNama() + 
                " dengan damage " + this.atkDamage);
        System.out.println("Sisa hp " + p.getNama() + " : " + p.getHp());
        System.out.println();
    }
}
