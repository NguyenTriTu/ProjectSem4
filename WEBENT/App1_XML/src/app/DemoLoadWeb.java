/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app1_xml.App1_XML;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Apple
 */
public class DemoLoadWeb {
     public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            String path="src//app//itemsData.xml";
            File file = new File(path);
            Document doc = builder.parse(file); // load xml structure in to bo nho
            System.out.println("Root name : "+doc.getDocumentElement().getNodeName());
            NodeList listitem = doc.getElementsByTagName("item");
            System.out.println("Number of product : " + listitem.getLength() );
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(App1_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(App1_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App1_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
