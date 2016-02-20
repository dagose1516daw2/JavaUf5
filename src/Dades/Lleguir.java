package Dades;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Classe que crea i escriu un document XML mitjançant JAXP i API DOM
 *
 */
public class Lleguir {

    private String nom;
    private ArrayList notes;
    private int nNotes;

    public int getNumNotes() {
        return nNotes;
    }

    public String getNom() {
        return nom;
    }
    public ArrayList getNotes() {
            return notes;
        }
    public void setNom(String nom) {
        this.nom = nom;
    }

   


  
    public  Lleguir() {
    }
      public ArrayList LleguirNota() {
             ArrayList Anotes = new ArrayList();
            try {
        
            File Llnotes = new File("Partitures.xml");
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(Llnotes);
            doc.getDocumentElement().normalize();

            System.out.println("arrel " + doc.getDocumentElement().getNodeName());
            
            NodeList nodes = doc.getElementsByTagName(nom);
            System.out.println("==========================");
                System.out.println(nodes.getLength());
                
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                 System.out.println("iner");
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                     
                    Element element = (Element) node;
                    
                     this.nNotes = Integer.parseInt(obtenirContingut("numeroNotes", element,0));
                     
                                       
                  for (int x = 0; x < nNotes; x++) {                      
                        int not = Integer.parseInt(obtenirContingut("nota", element,x));
                        System.out.println("anotes"+Anotes);
                   Anotes.add(not);
                   
                             }
                   
                 
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
         
                System.out.println("Error no hi ha cap cançó a reproduir");
            
        }
          
   return this.notes = Anotes; 
          
    }

    private static String obtenirContingut(String etiqueta, Element element,int n) {
    
        NodeList nodes = element.getElementsByTagName(etiqueta).item(n).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    
}
    
 
}
