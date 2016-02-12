
import java.util.HashMap;
import java.util.Scanner;





















public class HashMapDemo {
    
    
    
   public static void main(String args[]) {
   // create hash map
   HashMap newmap = new HashMap();
      
   // populate hash map
   newmap.put("1", "tutorials");
   newmap.put("2", "point");
   
   newmap.put("a", 60);
   newmap.put("s", "61");
   newmap.put("d", "62");
   newmap.put("f", "63");
   newmap.put("g", "64");
   newmap.put("h", "65");
   newmap.put("j", "66");
   newmap.put("k", "67");
   newmap.put("l", "68");
   newmap.put("ñ", "69");
   newmap.put("´", "70");
   newmap.put("ç", "71");
      
   // get value of key 3
//   String a=(String)newmap.get("a");
//   String s=(String)newmap.get("s");
   
//   String a=(String)newmap.get("a");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        System.out.println(newmap.get(answer));
   // check the value
//   System.out.println("Value for key 1 is: " + 1);
//   System.out.println("Value for key 2 is: " + 2);
//   
//   System.out.println("Value for key a is: " + a);
   }    
}














//package uf5;
//
//
//import Grafic.Lleguir;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.Synthesizer;
//import javax.sound.midi.MidiChannel;
//import javax.sound.midi.Instrument;
//import javax.sound.midi.MidiUnavailableException;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Uf5 {
//
//	
//             
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
//            
////            
////            int channel = 9; // 0 is a piano, 9 is percussion, other channels are for other instruments
////            int volume = 80; // between 0 et 127
////            int duration = 200; // in milliseconds
////////////////////////////////////////grabar notes//////////////////////////////                    
//////             
//////		
//////                String[] notes = {"60","61","63","60","61","63","60","61","63","60","61","63","60","61","63","60","61","63","60","61","63"};
//////                
//////                Grabar gnota= new Grabar();
//////                gnota.setNom("C1");
//////    
//////                
//////               
//////                
//////                   
//////               gnota.GrabarNota(notes);
//////                
///////////////////////////////////////LLeguir//////////////////////////////                
////                Lleguir Lnota= new Lleguir();
////                     Lnota.setNom("C1");
////                 ArrayList reproduir = Lnota.LleguirNota();
//////                 System.out.println(reproduir);
//////                 System.out.println(reproduir.size());
////                    //   Integer.parseInt(Lnota.LleguirNota());
//////                
//////        
//////                            
////                
////                
////		try {
////                    
////			Synthesizer synth = MidiSystem.getSynthesizer();
////			synth.open();
////			MidiChannel[] channels = synth.getChannels();
////
////                        
////                    Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
////                     for(int x=0;reproduir.size()>x;x++){
////                                channels[channel].noteOn((int) reproduir.get(x), volume ); // C note
////                                Thread.sleep( duration );  
////                     }
//////                         channels[channel].noteOn(nota, volume ); // C note
//////			Thread.sleep( duration );  
//////                       
////////			channels[channel].noteOn( 60, volume ); // C note
//////			Thread.sleep( duration );
//////
//////                     synth.loadInstrument(instr[76]);  // Bottle Blow
//////			//--------------------------------------
//////			
//////                        JFrame frame = new JFrame("Sound1");
//////                        JPanel pane = new JPanel();
//////                        JButton button1 = new JButton("Click me!");
//////                        frame.getContentPane().add(pane);
//////                        pane.add(button1);
//////                        frame.pack();
//////                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////                        frame.show();                       
////                        //-------------------------------------------
////                        // Play a few notes.
////			// The two arguments to the noteOn() method are:
////			// "MIDI note number" (pitch of the note),
////			// and "velocity" (i.e., volume, or intensity).
////			// Each of these arguments is between 0 and 127.
////                        
////
////
//////			Thread.sleep( 500 );
//////
//////			// --------------------------------------
//////			synth.close();
////		}
////		catch (Exception e) {
////			e.printStackTrace();
////		}
//	}
//
//}
//
