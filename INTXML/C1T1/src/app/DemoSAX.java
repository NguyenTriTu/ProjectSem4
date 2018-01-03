/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Apple
 */
public class DemoSAX extends DefaultHandler {

    private int count = 0;

    public static void main(String[] args) {
        String path = "src\\app\\data.xml";

        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            File f = new File(path);
            try {
                parser.parse(f, new DemoSAX());
            } catch (IOException ex) {
                Logger.getLogger(DemoSAX.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DemoSAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DemoSAX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        super.fatalError(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        super.error(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        super.warning(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void skippedEntity(String name) throws SAXException {
        super.skippedEntity(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {
        super.processingInstruction(target, data); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        super.ignorableWhitespace(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        System.out.println("found new element");
        if("Product".equals(qName))
            count++;
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
        super.endPrefixMapping(prefix); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        super.startPrefixMapping(prefix, uri); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("finish processing document");
        System.out.println("number of Product "+count);
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("begin processing document");
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        super.setDocumentLocator(locator); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {
        super.unparsedEntityDecl(name, publicId, systemId, notationName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notationDecl(String name, String publicId, String systemId) throws SAXException {
        super.notationDecl(name, publicId, systemId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
        return super.resolveEntity(publicId, systemId); //To change body of generated methods, choose Tools | Templates.
    }

}
