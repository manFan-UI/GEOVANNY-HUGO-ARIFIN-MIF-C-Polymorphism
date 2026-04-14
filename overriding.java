/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;
class Aset {
    void cekAturan() {
        System.out.println("Aturan umum investasi.");
    }}
class Saham extends Aset {
    @Override
    void cekAturan() {
        System.out.println("Aturan khusus: Ada pajak bursa 0.1%");
    }}
public class overriding {
    public static void main(String[] args) {
        
        // Tes Overriding
        Aset as = new Aset();
        as.cekAturan();     // Output: Aturan umum investasi.

        Saham sh = new Saham();
        sh.cekAturan();     // Output: Aturan khusus: Ada pajak bursa 0.1%.
    }
}
