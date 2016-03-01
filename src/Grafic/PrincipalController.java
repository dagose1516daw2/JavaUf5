package Grafic;

import Dades.piano;
import java.net.URL;
import Dades.Lleguir;
import javafx.fxml.FXML;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.IOException;
import java.util.ArrayList;
import exeption.ErrorLLegir;
import Teclat.Keyboard;
import org.xml.sax.SAXException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiUnavailableException;
import javax.xml.parsers.ParserConfigurationException;

/*
import java.util.Set;
import java.awt.List;
import Teclat.teclat;
import Teclat.Keypres;
import java.awt.Button;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import javafx.scene.text.Text;
import java.lang.reflect.Array;
import java.awt.event.KeyListener;
import java.awt.RenderingHints.Key;
import javafx.scene.input.KeyEvent;
import java.util.concurrent.TimeUnit;
import static sun.management.Agent.error;
import javax.xml.transform.TransformerException;
import com.sun.swing.internal.plaf.synth.resources.synth;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
*/

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
      
    //@FXML private Button D;
    //@FXML private Button R;
    //@FXML private Text textMissatge;
    
    @FXML protected void gestorBotoAction(ActionEvent event) throws InterruptedException, MidiUnavailableException, ErrorLLegir, ParserConfigurationException, SAXException, IOException
        {
        piano piano1 = new piano();
        Lleguir Lnota = new Lleguir();
        
        Lnota.setNom("C1");
        ArrayList reproduir = Lnota.LleguirNota();
        
        System.out.println(reproduir.size());
        
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
        
        for(int x=0 ; reproduir.size()>x ; x++)
            {
            channels[piano1.getChannelpiano()].noteOn((int) reproduir.get(x), piano1.getVolumepiano()); 
            Thread.sleep(piano1.getDurationpiano());  
            }
        }
    
    @FXML protected void gestorBotoTAction(ActionEvent event)
        {
        JFrame frame = new JFrame("Captura lletra");
 
        Keyboard key = new Keyboard();
        
        frame.setSize(275, 150);
        frame.add(key);
        
        JLabel X = new JLabel();
        X.setText("    CLIQUÏ AQUÏ I JA POTS COMENÇAR!");
        
        frame.add(X);
        frame.setVisible(true);
        }
    
    @FXML protected void gestorBotoCloseAction(ActionEvent event) throws InterruptedException
        {
        JFrame frame = new JFrame("T");
        frame.setSize(200, 200);
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public void Tocar(int n) throws MidiUnavailableException, InterruptedException 
        {
        piano piano1 = new piano();
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();

        channels[piano1.getChannelpiano()].noteOn((int)n, piano1.getVolumepiano()); 
        Thread.sleep(piano1.getDurationpiano());  
        }
    }