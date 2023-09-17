 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package systemcp.g;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author arthur
 */
public class IntaladorController implements Initializable {

    @FXML
    private RadioButton app1;
    private RadioButton app2;
    private Button ativar;
    
    @FXML
    private void instalar() {
        if(app1.isSelected()) {
            
        }
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
