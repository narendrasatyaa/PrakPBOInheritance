/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author HP
 */
public class Mobil extends Kendaraan{
    int jumlahPintu;
    
    String bahanBakar;
    
    Mobil(String nama, int tahunProduksi, String bahanBakar, int jumlahPintu){
        super(nama,tahunProduksi,bahanBakar);
        this.jumlahPintu = jumlahPintu;
        this.bahanBakar = "Listrik";
    }
    
}
