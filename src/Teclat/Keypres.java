package Teclat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Daniel Gonzalez, Alfred Ferrer.
 * @use Printa la tecla premuda.
 */
public class Keypres implements KeyListener 
    {
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));}

    @Override
    public void keyReleased(KeyEvent e) {System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));}
    }
