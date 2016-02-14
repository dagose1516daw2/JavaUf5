package Teclat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Grafic.PrincipalController;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class KeyboardExample extends JPanel {
	
	public KeyboardExample() {
      
		KeyListener listener = new MyKeyListener();
          
              
		addKeyListener(listener);
		setFocusable(true);
	}
	
	

	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent tecla) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
                    String  lletra;
                     teclat tecla=new teclat();

                    lletra = KeyEvent.getKeyText(e.getKeyCode());

                    tecla.nouTeclat();
//                    System.out.println(tecla.newmap.get(lletra));
                    
                    int nota= Integer.parseInt((String) tecla.newmap.get(lletra));
           
                    PrincipalController Pc= new PrincipalController();
                    
                    
                    try {
                        Pc.Tocar(nota);
                    } catch (MidiUnavailableException ex) {
                        Logger.getLogger(KeyboardExample.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(KeyboardExample.class.getName()).log(Level.SEVERE, null, ex);
                    }
              
		}

		@Override
		public void keyReleased(KeyEvent tecla) {
		//	System.out.println("keyReleased="+KeyEvent.getKeyText(tecla.getKeyCode()));
		}
	}
}