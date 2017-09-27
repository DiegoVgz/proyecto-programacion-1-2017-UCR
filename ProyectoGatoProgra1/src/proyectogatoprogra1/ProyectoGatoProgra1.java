/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogatoprogra1;

import com.sun.javafx.scene.control.skin.ToggleButtonSkin;
import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 1
 */
public class ProyectoGatoProgra1 extends Application {
    InterfazLogIn InterfazLogIn1;
    InterfazCréditos InterfazCreditos2; 
    
    
    @Override
    public void start(Stage primaryStage) {
        Text texto = new Text ();
        texto.setFill(Color.LIGHTSLATEGREY);
        texto.setText("El Juego del Gato");
        texto.setFont(Font.font("Kristen ITC", FontWeight.BLACK, FontPosture.ITALIC, 40) ); 
        texto.setStroke(Color.BLACK);   
        
        
        
        Button btn = new Button();
        
        //esto es lo de las imágenes, cree un nuevo paquete para esto.
        InputStream img = getClass().getResourceAsStream("/imagenes/gatos.jpg");
        Image imagen = new Image(img);
        
        InputStream img2 = getClass().getResourceAsStream("/imagenes/gatos2.jpg");
        Image imagen2 = new Image(img2);
        
        
        InputStream img3 = getClass().getResourceAsStream("/imagenes/gatos3.jpg");
        Image imagen3 = new Image(img3);
        
        //esto es la implementación del radioButton 
        ToggleGroup radioButton = new ToggleGroup();
        
        RadioButton rb_ejercicioUno = new RadioButton("Muestra el LogIn");
        rb_ejercicioUno.setToggleGroup(radioButton);
        rb_ejercicioUno.setGraphic(new ImageView(imagen));
        rb_ejercicioUno.setFont(Font.font("Kristen ITC",14));
        
        RadioButton rb_ejercicioDos = new RadioButton("Muestra el Juego");
        rb_ejercicioDos.setToggleGroup(radioButton);
        rb_ejercicioDos.setGraphic(new ImageView(imagen2));
        rb_ejercicioDos.setFont(Font.font("Kristen ITC",14));        
        
        RadioButton rb_ejercicioTres = new RadioButton("Muestra los créditos");
        rb_ejercicioTres.setToggleGroup(radioButton);
        rb_ejercicioTres.setGraphic(new ImageView(imagen3));
        rb_ejercicioTres.setFont(Font.font("Kristen ITC",14));
        
        
        VBox ventanaPrincipal = new VBox(texto,rb_ejercicioUno,rb_ejercicioDos,rb_ejercicioTres);
        ventanaPrincipal.setSpacing(30);
        ventanaPrincipal.setAlignment(Pos.CENTER);
        
        BorderPane root = new BorderPane();
        root.setLeft(ventanaPrincipal);
        
        
       rb_ejercicioUno.setOnAction((event) -> {
            rb_ejercicioUno.setTextFill(Color.DARKCYAN);
            rb_ejercicioDos.setTextFill(Color.BLACK);
            rb_ejercicioTres.setTextFill(Color.BLACK);
           
          InterfazLogIn1 = new InterfazLogIn();
          root.setRight(InterfazLogIn1.ventanaLogIn());
           
       });
       
       rb_ejercicioDos.setOnAction((event) -> {
         rb_ejercicioDos.setTextFill(Color.DARKCYAN);
            rb_ejercicioUno.setTextFill(Color.BLACK);
            rb_ejercicioTres.setTextFill(Color.BLACK);
           
         
       });
       
       
       rb_ejercicioTres.setOnAction((event) -> {
       rb_ejercicioTres.setTextFill(Color.DARKCYAN);
       rb_ejercicioDos.setTextFill(Color.BLACK);
       rb_ejercicioUno.setTextFill(Color.BLACK);
       
       InterfazCreditos2 = new InterfazCréditos();
       root.setRight(InterfazCreditos2.creditos());
       });
       
            
     
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                InterfazLogIn1 = new InterfazLogIn();
                root.setRight(InterfazLogIn1.ventanaLogIn());
            }
        });
        
        
        
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Proyecto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        launch(args);
    }
    
}
