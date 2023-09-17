module parouimpar {
    requires javafx.controls;
    requires javafx.fxml;

    opens parouimpar to javafx.fxml;
    exports parouimpar;
}
