

public class SegitigaSamaSisi {
    private final int tinggi;
    private final int sisi;

    public SegitigaSamaSisi(int tinggi, int sisi) {
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    public int hitungKeliling(){
        int keliling = 3 * this.sisi;
        return keliling;
    }
    
    public double hitungLuas(){
        double luas =  0.5 * this.sisi * this.tinggi;
        return luas;
    }
}
