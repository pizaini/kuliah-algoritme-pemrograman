/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mumpa
 */
public class PencarianController implements Initializable {
    @FXML
    private TextField textData, textArrayData, textCari;
    @FXML
    private Button buttonTambah, buttonCari;
    @FXML
    private TextArea textHasil;
    
    private PencarianArray pencarianArray;
    //kapasitas array
    private final int KAPASITAS_ARRAY = 20;
    //index array yang akan di tembahkan
    private int currentIndex = 0;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //membuat object array (instance)
         pencarianArray = new PencarianArray(KAPASITAS_ARRAY);
    }    
    @FXML
    private void tambahArrayData(){
        //mengambil nilai dari input textfield + konversi string ke int
        int dataArray = Integer.parseInt(textData.getText());
        //setiap menambahkan data kearray, tambahkan index + 1
        pencarianArray.setData(this.currentIndex++, dataArray);
        //hapus text di textfield dan focus
        textData.clear();
        textData.requestFocus();
        //tampilkan data
        this.tampilkanArrayData();
    }
    @FXML
    private void cariData(){
        //mengambil nilai dari input textfield + konversi string ke int
        int nilaiCari = Integer.parseInt(textCari.getText());
        int hasilCari = pencarianArray.cari(nilaiCari);
        //tampilkan pesan sesuai
        String text = hasilCari != - 1 ? nilaiCari+" pada index: "+String.valueOf(hasilCari) : "<not found>";
        textHasil.appendText(text+"\n");
        //hapus text di textfield dan focus
        textCari.clear();
        textCari.requestFocus();
    }
    
    private void tampilkanArrayData(){
        //mengambil data dari array
        int dataArray[] = pencarianArray.getData();
        //menambilkan array sbg string
        textArrayData.setText(Arrays.toString(dataArray));
    }
    
    
}
