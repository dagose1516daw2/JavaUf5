/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafic;


import com.sun.swing.internal.plaf.synth.resources.synth;
import java.awt.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;


public class PrincipalController implements Initializable {
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
		try {
//                     teclat nouTeclat= new teclat();
//                    nouTeclat.nouTeclat();
                   
                        Tocar();
                    }
	catch (Exception e) {
		e.printStackTrace();
                 }
        
    }
        
        
      
    @FXML private Button D;
    @FXML private Button R;
    
//    @FXML private Text textMissatge;
    
    @FXML protected void gestorBotoAction(ActionEvent event) throws InterruptedException, MidiUnavailableException{
            int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments
            int volume = 80; // between 0 et 127
            int duration = 200; // in milliseconds
        
            Lleguir Lnota= new Lleguir();
            Lnota.setNom("C1");
            ArrayList reproduir = Lnota.LleguirNota();                
            System.out.println(reproduir.size());     
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
            for(int x=0;reproduir.size()>x;x++){
                   channels[channel].noteOn((int) reproduir.get(x), volume ); 
                   Thread.sleep(duration);  
          }
        
    }
@FXML protected void gestorBotoDAction(ActionEvent event){
    
    
    
    
    
    
    
    
    
    
    
    
}
    private void Tocar() {
        teclat nouTeclat= new teclat();
        nouTeclat.nouTeclat();
        Scanner scan = new Scanner(System.in);
        
        String lletra = scan.next();
        System.out.println(nouTeclat.newmap.get(lletra));

  
    }
}