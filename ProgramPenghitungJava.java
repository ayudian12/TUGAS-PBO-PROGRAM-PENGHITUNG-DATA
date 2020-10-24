/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpenghitungjava;

/**
 *
 * @author ASUS A407M
 */
public class ProgramPenghitungJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Penghitung angka = new PenghitungJava();
    angka.statusProgram();
    System.out.println("Hasil Penjumlahan adalah "+angka.getPenghitungPenjumlahan(20, 40));
    System.out.println("Hasil Pengurangan adalah "+angka.getPenghitungPengurangan(30, 15));
    System.out.println("Hasil Perkalian adalah "+angka.getPenghitungPerkalian(10, 20));
    System.out.println("Hasil Pembagian adalah "+angka.getPenghitungPembagian(100, 20));
    
}
 