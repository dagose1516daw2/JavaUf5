package Teclat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dades.Grabar;
import Dades.Nota;
import Dades.NotaCom;
import Grafic.PrincipalController;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyboardExample extends JPanel 
    {
    public KeyboardExample()
        {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
	setFocusable(true);
	}
	
    public class MyKeyListener implements KeyListener 
        {
        
        private ArrayList notesG= new ArrayList();

        public ArrayList getNotesG() {return  notesG;}

       
	
        @Override
	public void keyTyped(KeyEvent tecla) {}

	@Override
	public void keyPressed(KeyEvent e) 
            {
            String  lletra;//variable local
            String  lletraG;
            teclat tecla= new teclat();//instanciem objecte teclat per poder carregar el nou keymap
            tecla.nouTeclat();//carregem el nou teclat
            lletra = KeyEvent.getKeyText(e.getKeyCode());//Recuperem e valor nou del teclat.
            lletraG= (String) tecla.newmap.get(lletra);
            Grabar Gnota= new Grabar();
            
            notesG.add(lletraG);
              System.out.println("1"+notesG);
              Gnota.setNom("C1");
             Gnota.GrabarNota(notesG);
            this.notesG=notesG;
            
            try {
                  PrincipalController Pc= new PrincipalController();    
                //recuperem el valor amb un int per poder passar al metode tocar i reproduirlo
             int nota= Integer.parseInt((String) tecla.newmap.get(lletra));
                Pc.Tocar(nota);
            }
            catch (MidiUnavailableException ex) {
                Logger.getLogger(KeyboardExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(KeyboardExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        @Override
        public void keyReleased(KeyEvent tecla) 
            {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(tecla.getKeyCode()));
            }
	}
    }