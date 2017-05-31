/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mumpa
 */
public class PencarianArray {
    // Property
    private int[] data;
    // Konstruktor
    public PencarianArray(int n){
        this.data = new int[n];
    }
    // Fungsi Set Data
    public void setData(int index, int value){
        if(index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }
// Fungsi Pencarian Beruntun
    public int cari(int x){
        for(int a=0; a<this.data.length; a++) {
            if(this.data[a] == x) {
                return a;
            }
        }
        return -1;
    }
    

    public int[] getData() {
        return data;
    }

}