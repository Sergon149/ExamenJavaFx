package com.example.examenjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    boolean pulso1=false,pulso2=false,pulso3=false,pulso4=false;

    @FXML
    private Label tx1;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;


    @FXML
    protected void b1clic() {
        System.out.println("Boton 1 pulsado");
        pulso1=true;
    }
    @FXML
    protected void b2clic() {
        pulso2 = true;
        System.out.println("Boton 2 pulsado");
    }
    @FXML
    protected void b3clic() {
        pulso3 = true;
        System.out.println("Boton 3 pulsado");
    }
    @FXML
    protected void b4clic() {
        pulso4 = true;
        System.out.println("Boton 4 pulsado");
        if (pulso1==true && pulso2==true && pulso3==true && pulso4==true){
            tx1.setText("Hola Amigo");
        }
    }
}