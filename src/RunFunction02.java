public class RunFunction02 {
    public static void main(String[] args) {
        Function02 f2 = new Function02();
        f2.namaSaya = "Bedu";
        f2.umurSaya = 17;
        f2.lihatNamaDanUmurSaya();
        
        f2.umurBaru(f2.umurSaya);
        f2.lihatNamaDanUmurSaya();
        
        f2.namaBaru(f2.namaSaya);
        f2.lihatNamaDanUmurSaya();
        
        f2.namaBaru2(f2);
        f2.lihatNamaDanUmurSaya();
    }
}
