/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dades;

/**
 *
 * @author dgs
 */
public class NotaCom  extends Nota{

    public String[] getnNotes() {
        return nNotes;
    }

    public void setnNotes(String[] nNotes) {
        this.nNotes = nNotes;
    }
   
//    @Override
    public int compareTo(String o) {
        
      throw new UnsupportedOperationException("Compare error!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
