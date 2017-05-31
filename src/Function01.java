public class Function01 {
    int panjang;
    int lebar;

    public Function01() {
        System.out.println("Ini adalah constructor");
    }
    
    public void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Panjang: "+panjang+", lebar: "+lebar+", luas: "+luas);
    }
    public void hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        System.out.println("Panjang: "+panjang+", lebar: "+lebar+", luas: "+luas);
    }
    
    public int hitungLuas2(){
        int luas = panjang * lebar;
        return luas;
    }
    
    public int hitungLuas2(int panjang, int lebar){
         int luas = panjang * lebar;
        return luas;
    }
}
