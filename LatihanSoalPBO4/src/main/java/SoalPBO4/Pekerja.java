/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO4;

/**
 *
 * @author afifa
 */
// Kelas Pekerja yang mewarisi kelas Manusia
public class Pekerja extends Manusia {
    // Atribut tambahan gaji dengan akses modifier private
    private double gaji;

    // Constructor untuk menginisialisasi atribut nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor kelas induk
        this.gaji = gaji;
    }

    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return "Nama : " + getNama() + 
               ", Usia : " + usia + 
               ", Pekerjaan : " + pekerjaan + 
               ", Gaji : " + gaji;
    }
}
