/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Mumpa
 */
public class UasController implements Initializable {
    @FXML
    private TextField textNamaSiswa;
    @FXML
    private Button buttonCari, buttonHitung;
    @FXML
    private Label labelBahasaInggris, labelMatematika, labelIpa, labelTotal, labelRataRata, labelStatus;
    
    @FXML
    private void cariSiswa(){
        String nama = textNamaSiswa.getText();
        NilaiSiswa nilaiSiswa = new NilaiSiswa(nama);
        int indexCari = nilaiSiswa.cariNamaSiswa();
        if(indexCari == -1){
            labelBahasaInggris.setText("0");
            labelIpa.setText("0");
            labelMatematika.setText("0");
        }else{
            labelBahasaInggris.setText(String.valueOf(nilaiSiswa.getNilaiBahasaInggris(indexCari)));
            labelIpa.setText(String.valueOf(nilaiSiswa.getNilaiIpa(indexCari)));
            labelMatematika.setText(String.valueOf(nilaiSiswa.getNilaiMatematika(indexCari)));
        }
    }
    
    @FXML
    private void hitung(){
        int bahasaInggris = new Integer(labelBahasaInggris.getText());
        int ipa = new Integer(labelIpa.getText());
        int matematika = new Integer(labelMatematika.getText());
        
        double total = bahasaInggris + ipa + matematika;
        double rataRata = total / 3;
        String status = "TIDAK LULUS";
        if(total > 160 && rataRata >= 80){
            status = "LULUS";
        }
        labelTotal.setText(String.valueOf(total));
        labelRataRata.setText(String.valueOf(rataRata));
        labelStatus.setText(status);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
