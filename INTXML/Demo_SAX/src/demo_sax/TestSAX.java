/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_sax;

import java.io.IOException;
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
public class TestSAX extends DefaultHandler {

    private int count = 0;
    private boolean markFound = false;
    private float maxMark = 0;

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
        if (markFound) {
            String str = new String(ch, start, length);
            if (str.trim().length() > 0) {
                float temp = Float.parseFloat(str);
                if (temp > maxMark) {
                    maxMark = temp;
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        System.out.println("End Element" + qName);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
      //  System.out.println("Start Element");
        System.out.println("Found new element " + qName);
        if (qName.equals("Student")) {
            count++;
        }
        if (qName.equals("Mark")) {
            markFound = true;
        } else {
            markFound = false;
        }
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
        System.out.println("finished processing");
        System.out.println("number of student " + count);
        System.out.println("max mark is " + markFound);

    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Begin processing document");
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
