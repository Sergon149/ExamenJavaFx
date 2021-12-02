module com.example.examenjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.examenjavafx to javafx.fxml;
    exports com.example.examenjavafx;
}