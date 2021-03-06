package Dades;

/**
 * @author Daniel Gonzalez, Alfred Ferrer.
 * @use Instancia els valors de la nota: Canal de nota, duració de la nota, volum de la nota. Atenció: no el número de nota.
 */
public abstract class Instrument
    {
    private int channelpiano = 0; 
    private int volumepiano = 80; 
    private int durationpiano = 500;
    
    public int getChannelpiano() {return channelpiano;}
    public void setChannelpiano(int channelpiano) {this.channelpiano = channelpiano;}

    public int getVolumepiano() {return volumepiano;}
    public void setVolumepiano(int volumepiano) {this.volumepiano = volumepiano;}

    public int getDurationpiano() {return durationpiano;}
    public void setDurationpiano(int durationpiano) {this.durationpiano = durationpiano;}

    public Instrument(){}
    }