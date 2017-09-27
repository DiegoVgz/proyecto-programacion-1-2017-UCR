/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogatoprogra1;

import java.io.InputStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class InterfazLogIn {

    TextField tfd_jugardor1;
    TextField tfd_jugardor2;
    String nombre1;
    String nombre2;

    Label lb_bienvenido;
    Button btn_inicioJuego;

    public VBox ventanaLogIn () {

        btn_inicioJuego = new Button("Ingresar");
        
        Text texto = new Text ();
        texto.setFill(Color.DARKCYAN);
        texto.setText("Ingrese los nombres de usuario");
        texto.setFont(Font.font("Kristen ITC", FontWeight.BLACK, FontPosture.ITALIC, 40) ); 
        texto.setStroke(Color.BLACK);   
        
        
        InputStream img = getClass().getResourceAsStream("/imagenes/gatos.jpg");
        Image imagen = new Image(img);
        
        btn_inicioJuego.setGraphic(new ImageView(imagen));
        btn_inicioJuego.setStyle("-fx-background-color: gray;");
        btn_inicioJuego.setFont(Font.font("Kristen ITC",12));

        btn_inicioJuego.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nombre1 = tfd_jugardor1.getText();
                nombre2 = tfd_jugardor2.getText();

            }
        });

        tfd_jugardor1 = new TextField();
        tfd_jugardor1.setPromptText("Ingrese el nombre del jugar 1");
        tfd_jugardor1.setFont(Font.font("Kristen ITC", 12));

        tfd_jugardor2 = new TextField();
        tfd_jugardor2.setPromptText("Ingrese el nombre del jugar 2");
        tfd_jugardor2.setFont(Font.font("Kristen ITC",12));

        VBox ventana1 = new VBox();
        
        ventana1.getChildren().addAll(texto,btn_inicioJuego, tfd_jugardor1, tfd_jugardor2);
        ventana1.setSpacing(30);
        ventana1.setAlignment(Pos.CENTER);

        return ventana1 ;
    }

}
