public class Kenderaan {
    private String jenisKenderaan;
    private Integer perpindahan;

    public Kenderaan() {
        this.perpindahan = 0;
    }
    void maju(int jarak){
        System.out.println(this.jenisKenderaan+" Maju "+jarak+" KM");
        hitungPerpindahan(jarak);
    }
    void mundur(int jarak){
        System.out.println(this.jenisKenderaan+" Mundur "+jarak+" KM");
        hitungPerpindahan(jarak * (-1));
    }
    void hitungPerpindahan(int jarak){
        this.perpindahan = this.perpindahan + jarak;
        System.out.println("Kenderaan berpindah "+this.perpindahan+" KM");
    }
    
    public static void main(String[] args) {
        Kenderaan kenderaan = new Kenderaan();
        kenderaan.jenisKenderaan = "Mobil";
        kenderaan.maju(10);
        kenderaan.mundur(2);
        kenderaan.maju(3);
        kenderaan.maju(5);
    }
}
