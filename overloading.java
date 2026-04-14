/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;
class Investasi {
    String namaAset;
    // Versi 1: Membeli berdasarkan jumlah unit (misal: 10 lot saham)
    void beli(int jumlahUnit) {
        System.out.println("Membeli " + jumlahUnit + " unit " + namaAset);
    }
    // Versi 2: Membeli berdasarkan nominal uang (misal: Rp 1.000.000)
    // Nama method sama, tapi parameter berbeda (double vs int)
    void beli(double nominalRupiah) {
        System.out.println("Membeli " + namaAset + " senilai Rp" + nominalRupiah);
    }}
public class overloading {
    public static void main(String[] args) {
        Investasi saham = new Investasi();
        saham.namaAset = "Saham BBCA";

        // Java otomatis memanggil Overloading 1 (karena 10 adalah int)
        saham.beli(10); 

        // Java otomatis memanggil Overloading 2 (karena 500000.0 adalah double)
        saham.beli(500000.0);
    }}
