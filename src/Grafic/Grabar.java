package Grafic;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Classe que crea i escriu un document XML mitjançant JAXP i API DOM
 *
 */
public class Grabar {

    private String nom;
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

  
    public Grabar() {
    }

    public void GrabarNota(String Nota[]) {

        try {
               
            DocumentBuilderFactory Partitura = DocumentBuilderFactory.newInstance();
            DocumentBuilder CreaDoc = Partitura.newDocumentBuilder();

            Document nodeDocument = CreaDoc.newDocument();
            Element elementArrel = nodeDocument.createElement("Cançons");
            nodeDocument.appendChild(elementArrel);

            Element Nom = nodeDocument.createElement(nom);
            elementArrel.appendChild(Nom);
            Nom.setAttribute("id", "1");//posar contandor

               
            for(int i=0;Nota.length>i;i++){
        
                            
            Element nota = nodeDocument.createElement("nota");
            Nom.appendChild(nota);
            nota.appendChild(nodeDocument.createTextNode(Nota[i]));
     
            }
            
            ////////////guardem nombre total de   notes/////////////////
            String nNota =  Integer.toString(Nota.length);
            Element nnotes = nodeDocument.createElement("numeroNotes");
            Nom.appendChild(nnotes);
            nnotes.appendChild(nodeDocument.createTextNode(nNota));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource origen = new DOMSource(nodeDocument);
            StreamResult sortidaXML = new StreamResult(new File("Partitures.xml"));
            System.out.println("Afeguida!");
            transformer.transform(origen, sortidaXML);
      

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }

    }
}
