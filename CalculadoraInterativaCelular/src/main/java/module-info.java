module calculadorainterativacelular {
    requires javafx.controls;
    requires javafx.fxml;

    opens calculadorainterativacelular to javafx.fxml;
    exports calculadorainterativacelular;
}
