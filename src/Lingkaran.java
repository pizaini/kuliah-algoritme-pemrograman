/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mumpa
 */
public class Lingkaran {
    private int jariJari;
    private final double phi = 3.14;
    
    void hitungKeliling(){
        System.out.println("Menghitungng keliling");
        double keliling = 2 * this.phi * this.jariJari;
        System.out.println("Keliling lingkaran adalah: "+keliling+" cm");
    }
    
    public void hitungLuas(){
        System.out.println("Menghitung luas");
    }
    
    public void hitungDiameter(){
        System.out.println("Menghitung diamater");
    }
    
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 25;
        System.out.println("Jari-jari: "+lingkaran.jariJari);
        lingkaran.hitungKeliling();
    }
    
    
}
