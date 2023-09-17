/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package adivinhanumero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Win10
 */
public class AdivinhacaoController implements Initializable {
    
    @FXML
    private Label fraze;
    private Slider valor;
    private Label mostrarValor;
    private Button btnPalpite;

    int num = (int) valor.getValue();
    @FXML
    private void Muda() {
        fraze.setText("<html>Vou pensar em um valor entre 1 e 5. Tente adivinhar</html>");
        mostrarValor.setText(Integer.toString(num));
    }
   
    private void  Clicou() {
       double n = 1 + Math.random() * (6 - 2);
       int inteiro = (int) n;
       String f1 = "<html>ACERTOU!</html>";
       String f2 = "<html>ERROU! Eu pensei no numero " + num + "</html>";
       fraze.setFont(new Font("Arial Black", 18));
       String res = (inteiro == num)?f1:f2;
       fraze.setText(res);
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
       
}
