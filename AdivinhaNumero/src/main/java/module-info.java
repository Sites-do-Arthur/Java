module adivinhanumero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens adivinhanumero to javafx.fxml;
    exports adivinhanumero;
}
