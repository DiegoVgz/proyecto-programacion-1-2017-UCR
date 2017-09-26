/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogatoprogra1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class InterfazLogIn {

    TextField tfd_jugardor1;
    TextField tfd_jugardor2;
    String nombre1;
    String nombre2;

    Label lb_bienvenido;
    Button btn_inicioJuego;

    public VBox  ventanaLogIn () {

        btn_inicioJuego = new Button();

        btn_inicioJuego.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nombre1 = tfd_jugardor1.getText();
                nombre2 = tfd_jugardor2.getText();

            }
        });

        tfd_jugardor1 = new TextField();
        tfd_jugardor1.setPromptText("Ingrese el nombre del jugar 1");
        tfd_jugardor1.setFont(Font.font("Gigi", 12));

        tfd_jugardor2 = new TextField();
        tfd_jugardor2.setPromptText("Ingrese el nombre del jugar 2");

        VBox ventana1 = new VBox();
        ventana1.getChildren().addAll(btn_inicioJuego, tfd_jugardor1, tfd_jugardor2);
        ventana1.setSpacing(30);

        return ventana1 ;
    }

}
