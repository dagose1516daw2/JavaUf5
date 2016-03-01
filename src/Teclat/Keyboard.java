package Teclat;

/*
import Dades.Nota;
import Dades.NotaCom;
import java.util.Set;
import java.util.HashSet;
import javax.swing.JFrame;
*/

import Dades.Grabar;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyListener;
import Grafic.PrincipalController;
import javax.sound.midi.MidiUnavailableException;

public class Keyboard extends JPanel 
    {
    public Keyboard()
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
            String lletra; //Variable local.
            String lletraG;
            teclat tecla = new teclat(); //Instanciar l'objecte teclat per poder carregar el nou "keymap".
            tecla.nouTeclat(); //Carregar el nou teclat.
            lletra = KeyEvent.getKeyText(e.getKeyCode()); //Recuperar el valor nou del teclat.
            lletraG = (String) tecla.newmap.get(lletra);
            Grabar Gnota= new Grabar();
            
            notesG.add(lletraG);
            System.out.println("1" + notesG);
            Gnota.setNom("C1");
            Gnota.GrabarNota(notesG);
            this.notesG = notesG;
            
            try 
                {
                PrincipalController Pc = new PrincipalController();
                
                //Recuperar el valor amb un int per poder passar-lo al metode "Tocar" i reproduir-lo.
                int nota = Integer.parseInt((String) tecla.newmap.get(lletra));
                Pc.Tocar(nota);
                }
            
            catch (MidiUnavailableException ex) {Logger.getLogger(Keyboard.class.getName()).log(Level.SEVERE, null, ex);}
            
            catch (InterruptedException ex) {Logger.getLogger(Keyboard.class.getName()).log(Level.SEVERE, null, ex);}
            }

        @Override
        public void keyReleased(KeyEvent tecla) 
            {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(tecla.getKeyCode()));
            }
	}
    }