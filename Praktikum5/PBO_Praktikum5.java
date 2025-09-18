package com.mycompany.pbo_praktikum5;

public class PBO_Praktikum5 {

    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil("Toyota", "Merah", 2025);
        Mobil mobilKedua = new Mobil("Alpard", "Hitam", 2020);
        
        Mobil mobilKetiga = new Mobil();
        
        Kalkulator cal = new Kalkulator();
        System.out.println("1 + 10 = " + cal.tambah(1, 10));
        System.out.println("2.4 + 3.3 = " + cal.tambah(2.4, 3.3));
        
//        Hewan kucing = new Hewan();

// Tugas
//        MakhlukHidup Gurita = new MakhlukHidup("Omnivora", "Invertebrata", "Ovipar");
//        MakhlukHidup ayam = new MakhlukHidup();
//        MakhlukHidup hiu = new MakhlukHidup("Karnivora", "Vertebrata", "Ovovivipar");
//        hiu.info("Vertebrata");
    }
}
