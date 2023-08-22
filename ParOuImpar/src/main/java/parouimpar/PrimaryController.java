package parouimpar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private TextField valor;
    private Button clique;
    private Label resultado;
    
    @FXML
    private void clikou() {
        int numero = Integer.parseInt(valor.getText());
        if(numero % 2 == 0) {
            resultado.setText("O valor " + numero + " é PAR.");
        } else {
            resultado.setText("O valor " + numero + " é IMPAR");
        }
    }
}