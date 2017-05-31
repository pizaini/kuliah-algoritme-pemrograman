public class Function03 {
    public void gantiMahasiswa(Mahasiswa mhs){
        mhs.nama = "Nama 2";
        mhs.umur = 2;
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "ANDI";
        mhs1.umur = 20;
        System.out.println("Nama1: "+mhs1.nama+", umur1: "+mhs1.umur);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2 = mhs1;
        System.out.println("Nama2: "+mhs2.nama+", umur2: "+mhs2.umur);
        
        Function03 f3 = new Function03();
        f3.gantiMahasiswa(mhs1);
        
        System.out.println("Nama1: "+mhs1.nama+", umur1: "+mhs1.umur);
        System.out.println("Nama2: "+mhs2.nama+", umur2: "+mhs2.umur);
    }
}
