/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", 200, "Bensin", 4);
        Mobil mobil2 = new Mobil("Honda", 180, "Diesel", 4);

        // Menampilkan informasi mobil
        System.out.println("Informasi Mobil 1:");
        mobil1.tampilkanInfoMobil();
        System.out.println();

        System.out.println("Informasi Mobil 2:");
        mobil2.tampilkanInfoMobil();
    }
}
