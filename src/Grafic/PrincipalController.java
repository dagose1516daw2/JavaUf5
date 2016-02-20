/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafic;

import Dades.Grabar;
import Teclat.KeyboardExample;
import Teclat.Keypres;
import Teclat.teclat;
import Dades.Lleguir;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import com.sun.swing.internal.plaf.synth.resources.synth;
import java.awt.Button;
import java.awt.List;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.transform.TransformerException;

public class PrincipalController implements Initializable
    {
    public ArrayList notesG = new ArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
        {
        try {}
	catch (Exception e) {e.printStackTrace();}
        }
    

    public void setNotesG(ArrayList notesG) {this.notesG = notesG;}
      
//    @FXML private Button D;
//    @FXML private Button R;
    
//    @FXML private Text textMissatge;
    
    @FXML protected void gestorBotoAction(ActionEvent event) throws InterruptedException, MidiUnavailableException
        {
            int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments
            int volume = 80; // between 0 et 127
            int duration = 500; // in milliseconds
        
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
    
    @FXML protected void gestorBotoTAction(ActionEvent event)
        {
        JFrame frame = new JFrame("Captura lletra");
 
        KeyboardExample key = new KeyboardExample();
        frame.add(key);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    @FXML protected void gestorBotoDAction(ActionEvent event) throws TransformerException
        {
          

        }

    public void Tocar(int n) throws MidiUnavailableException, InterruptedException 
        {
        System.out.println("integer "+n);      

        int channel = 0; // 0 is a piano
        int volume = 80; // between 0 et 127
        int duration = 200; // in milliseconds

        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();

        channels[channel].noteOn((int)n, volume ); 
        Thread.sleep(duration);  
        }

}