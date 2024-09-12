/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author afifa
 */
public class PraktikumPBO4 {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Ngengg", "Ngungg", 2010);
        
        System.out.println("Merek : " + mobil.getMerk());
        System.out.println("Model : " + mobil.getModel());
        System.out.println("Tahun : " + mobil.getTahun());
        
        mobil.setModel("Uwaw");
        mobil.setTahun(2023);
        
        System.out.println("Merek : " + mobil.getMerk());
        System.out.println("Model Baru : " + mobil.getModel());
        System.out.println("Tahun Baru : " + mobil.getTahun());
    }
}
