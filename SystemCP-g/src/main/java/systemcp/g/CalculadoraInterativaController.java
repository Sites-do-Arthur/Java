/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package systemcp.g;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Win10
 */
public class CalculadoraInterativaController implements Initializable {
    
    @FXML
    private TextField numero1;
    private TextField numero2;
    private Button adicao;
    private Button subtracao;
    private Button multiplicacao;
    private Button divisao;
    private Label resultado;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    private void adicaoActionPerform() {
        int n1 = Integer.parseInt(numero1.getText());
        int n2 = Integer.parseInt(numero2.getText());
        int r = n1 + n2;
        resultado.setText(Integer.toString(r));
    }
    
    private void subtracaoActionPerform() {
        int n1 = Integer.parseInt(numero1.getText());
        int n2 = Integer.parseInt(numero2.getText());
        int r = n1 - n2;
        resultado.setText(Integer.toString(r));
    }
    
    private void multiplicacaoActionPerform() {
        int n1 = Integer.parseInt(numero1.getText());
        int n2 = Integer.parseInt(numero2.getText());
        int r = n1 * n2;
        resultado.setText(Integer.toString(r));
    }
    
    private void divisaoActionPerform() {
        int n1 = Integer.parseInt(numero1.getText());
        int n2 = Integer.parseInt(numero2.getText());
        int r = n1 / n2;
        resultado.setText(Integer.toString(r));
    }
    
}
