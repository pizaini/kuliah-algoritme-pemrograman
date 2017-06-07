/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Mumpa
 */
public class NilaiSiswa {
    private String[] namaSiswa = new String[]{
    "Antoni", "Cahyadi", "Bagus", "Mustafa", "Zainal"
    };
    private int[] nilaiBahasaInggris = {90, 70, 85, 91, 83};
    private int[] nilaiMatematika = {87, 70, 85, 91, 83};
    private int[] nilaiIpa = {89, 70, 85, 91, 83};
    private String cariNama;

    public NilaiSiswa(String cariNama) {
        this.cariNama = cariNama;
    }
    
    public int cariNamaSiswa(){
        for(int i = 0; i < namaSiswa.length; i++){
            if(namaSiswa[i].equalsIgnoreCase(this.cariNama)){
                return i;
            }
        }
        return -1;
    }

    public int getNilaiBahasaInggris(int index) {
        return nilaiBahasaInggris[index];
    }

    public int getNilaiIpa(int index) {
        return nilaiIpa[index];
    }

    public int getNilaiMatematika(int index) {
        return nilaiMatematika[index];
    }
    
   
}
