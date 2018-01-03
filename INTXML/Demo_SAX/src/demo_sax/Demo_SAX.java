/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_sax;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Apple
 */
public class Demo_SAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            File f = new File("src\\app\\XMLDocument.xml");
            parser.parse(f, new TestSAX());
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
