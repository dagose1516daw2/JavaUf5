/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafic;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

    
    @Override
    public void start(Stage stage) throws IOException {

        try {
            
           Parent  arrel = FXMLLoader.load(getClass().getResource("Interficie.fxml"));
            stage.setTitle("Piano");
            stage.setScene(new Scene(arrel, 1000, 500));
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    public static void main(String[] args) {
        Application.launch(Principal.class, args);
        
    }
  
}