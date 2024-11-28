/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Tesla Model S", 2023,"Bensin", 2);
        
        Pesawat pesawat = new Pesawat("Boeing 737", 2022, "Aftur", "2");
        
        System.out.println("Mobil: ");
        System.out.println("Nama: "+ mobil.nama);
        System.out.println("Tahun Produksi: " + mobil.tahunProduksi);
        System.out.println("Bahan Bakar Super: " + ((Kendaraan)mobil).bahanBakar);
        System.out.println("Bahan Bakar Sub: " + mobil.bahanBakar);
        System.out.println("Jumlah Pintu: " + mobil.jumlahPintu);
        
        
        System.out.println("\n Pesawat:");
        System.out.println("Nama :" + pesawat.nama);
        System.out.println("Tahun Produksi :" + pesawat.tahunProduksi);
        System.out.println("Bahan Bakar Super:" +((Kendaraan)pesawat). bahanBakar);
        System.out.println("Bahan Bakar Sub:" + pesawat.bahanBakar);
        System.out.println("Jumlah Mesin :" + pesawat.jumlahMesin);
        
    }
}
