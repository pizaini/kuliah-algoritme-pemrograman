public class RunFuntion01 {
    public static void main(String[] args) {
        Function01 function01 = new Function01();
        function01.panjang = 6;
        function01.lebar = 4;
        
        function01.hitungLuas();
        
        function01.hitungLuas(20, 5);
        
        int luas2 = function01.hitungLuas2();
        System.out.println("Luas2: "+luas2);
        
        int luas22 = function01.hitungLuas2(15, 10);
        System.out.println("Luas22: "+luas22);
    }
}
