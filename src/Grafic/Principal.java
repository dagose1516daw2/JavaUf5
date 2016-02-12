/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafic;


import Teclat.KeyboardExample;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;

public class Principal extends Application {

    
    @Override
    public void start(Stage stage) throws IOException {

        try {
            JFrame frame = new JFrame("Captura lletra");
           KeyboardExample key = new KeyboardExample();
           frame.add(key);
           frame.setSize(1000, 500);
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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