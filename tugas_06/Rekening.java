/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_06;

/**
 *
 * @author user
 */
public class Rekening {
    private String namaNasabah;
    private final String nomorRekening;
    private String pinRekening;
    private double saldoRekening;
    
    
    public Rekening(String namaNasabah, String nomorRekening, 
            String pinRekening, double saldoRekening){
        this.namaNasabah = namaNasabah;
        this.nomorRekening = nomorRekening;
        this.pinRekening = pinRekening;
        this.saldoRekening = saldoRekening;
        Bank.jumlahNasabah++;
    }
    
    public String getNamaNasabah(){
        return namaNasabah;
    }
    
    public String getNomorRekening(){
        return nomorRekening;
    }
    
    public String getPinRekening(){
        return pinRekening;
    }
    
    public void setPinRekening(String pinRekeningBaru){
        if(pinRekeningBaru.length() == 6){
            this.pinRekening = pinRekeningBaru;
            System.out.println("Pin  berhasil diubah menjadi " + pinRekeningBaru);
        }
        else{
            System.out.println("Pin " + pinRekeningBaru + 
                    " tidak valid, pin harus 6 digit");
        }
    }
    
    public double getSaldo(){
        return saldoRekening;
    }
    
    public void setorSaldo(double jumlah){
        if(jumlah > 0){
            this.saldoRekening += jumlah;
            System.out.println("Berhasil setor saldo senilai : Rp." + jumlah );
        }
    }
    
    public void tarikSaldo(double jumlah){
        if(this.saldoRekening >= jumlah){
            this.saldoRekening -= jumlah;
            System.out.println("Berhasil tarik saldo senilai: Rp." + jumlah );
        }
        else{
           System.out.println("Saldo tidak cukup"); 
        }
    }
}
