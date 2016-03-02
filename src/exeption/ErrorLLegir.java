package exeption;

/**
 * @author Daniel Gonzalez, Alfred Ferrer.
 * @use S'executa si s'intenta reproduir un fitxer amb notes sense que aquest existeixi.
 */
public class ErrorLLegir extends Exception 
    {
    public ErrorLLegir(){}
    
    /**
     * @return "falta fitxer".
     */
    public String ErrorLLegirfitxer(){return "falta fitxer";}
    }