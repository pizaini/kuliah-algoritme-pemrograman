

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mumpa
 */
public class SegitigaSamaSisiController implements Initializable {
    @FXML
    private TextField textSisi, textTinggi;
    @FXML
    private Button buttonHitung;
    @FXML
    private Label labelLuas, labelKeliling;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void hitungLuasDanKeliling(ActionEvent ev){
        int sisi = Integer.parseInt(textSisi.getText());
        int tinggi = Integer.parseInt(textTinggi.getText());
        SegitigaSamaSisi segitiga = 
                new SegitigaSamaSisi(tinggi, sisi);
        labelKeliling.setText(String.valueOf(segitiga.hitungKeliling()));
        labelLuas.setText(String.valueOf(segitiga.hitungLuas()));
    }
  
    
}
