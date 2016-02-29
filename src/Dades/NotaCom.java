package Dades;

public class NotaCom  extends Nota
    {
    public String[] getnNotes() {return nNotes;}

    public void setnNotes(String[] nNotes) {this.nNotes = nNotes;}
   
    //@Override
    public int compareTo(String o) {throw new UnsupportedOperationException("Compare error!");} //To change body of generated methods, choose Tools | Templates.
    
    @Override
    public int compareTo(Object o) {throw new UnsupportedOperationException("Not supported yet.");} //To change body of generated methods, choose Tools | Templates.
    }
