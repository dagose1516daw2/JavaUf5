package Dades;

//import java.util.HashSet;
import java.io.File;
import java.util.ArrayList;
import javax.xml.transform.Transformer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

/* Classe que crea i escriu un document XML mitjançant JAXP i API DOM
 */
public class Grabar
    {
    // private ArrayList Nota = new ArrayList();
    // public void setNota(ArrayList Nota) {this.Nota = Nota;}
    private String nom;
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public Grabar() {}

    public void GrabarNota(ArrayList Nota) 
        {
        try 
            {  
            System.out.println("GN"+Nota);
            DocumentBuilderFactory Partitura = DocumentBuilderFactory.newInstance();
            DocumentBuilder CreaDoc = Partitura.newDocumentBuilder();

            Document nodeDocument = CreaDoc.newDocument();
            Element elementArrel = nodeDocument.createElement("Cançons");
            nodeDocument.appendChild(elementArrel);

            Element Nom = nodeDocument.createElement(nom);
            elementArrel.appendChild(Nom);
            Nom.setAttribute("id", "1"); //posar contandor
            
            for(int i=0;Nota.size()>i;i++)
                {
                Element nota = nodeDocument.createElement("nota");
                Nom.appendChild(nota);
                nota.appendChild(nodeDocument.createTextNode((String)Nota.get(i)));
                }
            
            ////////////guardem nombre total de notes/////////////////
            
            String nNota =  Integer.toString(Nota.size());
            Element nnotes = nodeDocument.createElement("numeroNotes");
            Nom.appendChild(nnotes);
            nnotes.appendChild(nodeDocument.createTextNode(nNota));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource origen = new DOMSource(nodeDocument);
            StreamResult sortidaXML = new StreamResult(new File("Partitures.xml"));
            System.out.println("Afeguida!");
            transformer.transform(origen, sortidaXML);
            } 
        
        catch (ParserConfigurationException pce)
            {
            pce.printStackTrace();
            System.out.println("Error gaurdar cançó");
            } 
        
        catch (TransformerException tfe) 
            {
            tfe.printStackTrace();
            System.out.println("Error guardar cançó");}
            }
    }
