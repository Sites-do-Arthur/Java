/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package systemcp.g;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import systemcp.g.sql.java.SqlArquivos;

/**
 * FXML Controller class
 *
 * @author Win10
 */
public class FileManagerController implements Initializable {
    @FXML
    private TextField arquivo;
    private TextArea oarquivo;
    private Button procure;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
   private void procurar() {
       String procurar = arquivo.getText();
       String dado;
       String save = oarquivo.getText();
       boolean vini;
       boolean amanda;
       
        amanda = "Amanda".equals(procurar);
        vini = "Vinicius".equals(procurar);
       if(amanda) {
            dado = SqlArquivos.sqlAlunos("Amanda");
       } else {
           if (vini) {
               SqlArquivos.sqlAlunos("Vinicius");
           }
       }
    } 
}
