/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author HP
 */
public class Pesawat extends Kendaraan{
    String jumlahMesin;
    
    String bahanBakar;
    
    Pesawat(String nama, int tahunProduksi, String bahanBakar, String jumlahMesin){
        super(nama,tahunProduksi,bahanBakar);
        this.jumlahMesin = jumlahMesin;
        this.bahanBakar = "Avgas";
    }
}
