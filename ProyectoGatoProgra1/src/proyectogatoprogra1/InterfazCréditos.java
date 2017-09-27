/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogatoprogra1;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Melissa Ramírez R
 */
public class InterfazCréditos {
    
    public VBox creditos (){
    
    Text creditos = new Text ();
       Text Titulo = new Text (); 
       Titulo.setText("El Juego del Gato");
       Titulo.setFont(Font.font("Kristen ITC", FontWeight.BLACK, FontPosture.ITALIC, 40) ); 
       Titulo.setStroke(Color.MEDIUMAQUAMARINE); 
       Titulo.setFill(Color.WHITE);
       
       creditos.setFill(Color.LIGHTSLATEGREY);
       creditos.setText(
               "Universidad de Costa Rica"+ "\n"+ 
               "Curso de Programación I" + "\n" +
               "II Semestre de 2017"+  "\n"+ "\n"+     
               "Creadores Ejecutivos" 
               +"\n"+ "\n" + "Melvin Astorga"+ 
               "\n"+ "Melissa Ramírez" 
               +"\n"+ "Diego Vega" 
               + "\n"+ "\n" +  "Profesor"+ "\n"+ "Gabriela Guevara"+ "\n");
       creditos.setFont(Font.font("Kristen ITC", FontWeight.BLACK, FontPosture.ITALIC, 12) ); 
       creditos.setStroke(Color.BLACK); 
       
       
       VBox ventanaCreditos = new VBox();
       
       ventanaCreditos.setAlignment(Pos.CENTER);
       ventanaCreditos.getChildren().addAll(Titulo,creditos);
    
    
    
       return ventanaCreditos;
    
    }
    
}
