
import java.util.Random;



public class Array01 {
    private String[] namaMahasiswa = new String[10];
    private String[] namaDosen = new String[]{
        "Dosen1", "Dosen2", "Dosen3", "Dosen4", "Dosen5"
    };
    private Integer[] ipkMahasiswa = new Integer[3];

    public String[] getNamaMahasiswa() {
        return namaMahasiswa;
    }
   
    public void tambahkanDataMahasiswa(){
        namaMahasiswa[0] = "AAAAA"; namaMahasiswa[1] = "BBBBBB";
        namaMahasiswa[2] = "CCCCC"; namaMahasiswa[3] = "DDDDD";
        namaMahasiswa[4] = "EEEEE"; namaMahasiswa[5] = "FFFFF";
        namaMahasiswa[6] = "GGGGG"; namaMahasiswa[7] = "HHHHH";
        namaMahasiswa[8] = "IIIII"; namaMahasiswa[9] = "JJJJJ";
    }
    public void tambahDataDosen(){
       // namaDosen[6]= "Dosen6";
    }
    public void tambahDataIpk(){
        for(int i = 0; i < ipkMahasiswa.length - 1; i++){
            ipkMahasiswa[i] = new Random().nextInt();
        }
    }
    public void lihatSemuaData(){
        //data Mahasiswa
        System.out.println("Data Mahasiswa");
        for(int i = 0; i < namaMahasiswa.length - 1; i++){
            String nama = namaMahasiswa[i];
            System.out.print(nama+"-");
        }
        //Dosen
        System.out.println("Data dosen");
        for(int i = 0; i < namaDosen.length - 1; i++){
            System.out.print(namaDosen[i]+"-");
        }
        //IPK
        System.out.println("Data IPK");
        for(int i = 0; i < ipkMahasiswa.length - 1; i++){
            System.out.print(ipkMahasiswa[i]+"-");
        }
    }
}
