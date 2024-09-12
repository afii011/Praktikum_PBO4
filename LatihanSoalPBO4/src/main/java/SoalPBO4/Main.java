/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO4;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja dan menginisialisasi dengan nama, usia, pekerjaan, dan gaji
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Programmer", 7500000);

        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja1.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja1.setNama("Andi");
        
        // Menampilkan ulang informasi pekerja setelah mengubah nama
        System.out.println("Informasi setelah mengubah nama :");
        System.out.println(pekerja1.toString());
    }
}