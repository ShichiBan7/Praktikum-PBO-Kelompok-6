/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_9;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String JenisKelamin;
    private boolean active;
    
    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList <> ();

    public Mahasiswa(String nama, String nim, String prodi, String JenisKelamin, boolean active) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.JenisKelamin = JenisKelamin;
        this.active = active;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
