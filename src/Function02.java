public class Function02 {
    String namaSaya;
    int umurSaya;
    
    public void namaBaru(String nama){
        nama = "Nama baru";
    }
    public void umurBaru(int umur){
        umur = 50;
    }
    public void namaBaru2(Function02 f2){
        f2.namaSaya = "NAMA BARU";
        f2.umurSaya = 100;
    }
    public void lihatNamaDanUmurSaya(){
        System.out.println("Nama saya saat ini: "+this.namaSaya+", umur: "+this.umurSaya);
    }
}