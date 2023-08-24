/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package systemcp.g;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import systemcp.g.sql.java.App;

/**
 * FXML Controller class
 *
 * @author Win10
 */
public class ProgramManagerController implements Initializable {

    @FXML
    private RadioButton Calc;
    private RadioButton File;
    private Button Aplic;
    private Button Close;
    
    @FXML
    private void ativar() throws IOException {
        if(Calc.isSelected()) {
            App.setRoot("CalculadoraInterativa.fxml");
        }
        if(File.isSelected()) {
            App.setRoot("FileManager.fxml");
        }
    }
    private void sair() {
        
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
