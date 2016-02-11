package uf5;


import Grafic.Lleguir;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Uf5 {

	public static void main( String[] args ) {
             
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//            
//            int channel = 9; // 0 is a piano, 9 is percussion, other channels are for other instruments
//            int volume = 80; // between 0 et 127
//            int duration = 200; // in milliseconds
//////////////////////////////////////grabar notes//////////////////////////////                    
////             
////		
////                String[] notes = {"60","61","63","60","61","63","60","61","63","60","61","63","60","61","63","60","61","63","60","61","63"};
////                
////                Grabar gnota= new Grabar();
////                gnota.setNom("C1");
////    
////                
////               
////                
////                   
////               gnota.GrabarNota(notes);
////                
/////////////////////////////////////LLeguir//////////////////////////////                
//                Lleguir Lnota= new Lleguir();
//                     Lnota.setNom("C1");
//                 ArrayList reproduir = Lnota.LleguirNota();
////                 System.out.println(reproduir);
////                 System.out.println(reproduir.size());
//                    //   Integer.parseInt(Lnota.LleguirNota());
////                
////        
////                            
//                
//                
//		try {
//                    
//			Synthesizer synth = MidiSystem.getSynthesizer();
//			synth.open();
//			MidiChannel[] channels = synth.getChannels();
//
//                        
//                    Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
//                     for(int x=0;reproduir.size()>x;x++){
//                                channels[channel].noteOn((int) reproduir.get(x), volume ); // C note
//                                Thread.sleep( duration );  
//                     }
////                         channels[channel].noteOn(nota, volume ); // C note
////			Thread.sleep( duration );  
////                       
//////			channels[channel].noteOn( 60, volume ); // C note
////			Thread.sleep( duration );
////
////                     synth.loadInstrument(instr[76]);  // Bottle Blow
////			//--------------------------------------
////			
////                        JFrame frame = new JFrame("Sound1");
////                        JPanel pane = new JPanel();
////                        JButton button1 = new JButton("Click me!");
////                        frame.getContentPane().add(pane);
////                        pane.add(button1);
////                        frame.pack();
////                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////                        frame.show();                       
//                        //-------------------------------------------
//                        // Play a few notes.
//			// The two arguments to the noteOn() method are:
//			// "MIDI note number" (pitch of the note),
//			// and "velocity" (i.e., volume, or intensity).
//			// Each of these arguments is between 0 and 127.
//                        
//
//
////			Thread.sleep( 500 );
////
////			// --------------------------------------
////			synth.close();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}

