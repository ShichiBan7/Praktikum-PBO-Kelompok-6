/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_6;

/**
 *
 * @author LENOVO
 */
public class Latihan_6 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("BNI", "Pekanbaru");
        Rekening rekening1 = new Rekening("Siti Nazira", "1827254620", "12345", 8000000);

        System.out.println("Nama Bank : " + bank1.getNamaBank());
        System.out.println("Lokasi Cabang : " + bank1.getLokasiBank());
        System.out.println("Nama Nasabah : " + rekening1.getNamaNasabah());
        System.out.println("Nomor Rekenig : " + rekening1.getNomorRekening());
        System.out.println("Pin rekening : " + rekening1.getPinRekening());
        System.out.println("Jumlah Saldo : Rp." + rekening1.getSaldo());
        System.out.println("Jumlah nasabah dari bank " + bank1.getNamaBank() + " : " 
                + Bank.jumlahNasabah + " Nasabah");

        rekening1.setPinRekening("12345");
        rekening1.setPinRekening("123456");
        
        rekening1.tarikSaldo(100000);
        rekening1.setorSaldo(200000);
        System.out.println("Jumlah Saldo : Rp." + rekening1.getSaldo());
    }
}


