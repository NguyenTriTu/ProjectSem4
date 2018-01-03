/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Apple
 */
public class DOMModel {

    private static String path = "src\\app\\Data.xml";

    private static Document parserData() {
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            File f = new File(path);
            doc = builder.parse(f); // load xml structure in to bo nho
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return doc;
        }
    }

    private static ArrayList<Node> search(String name) {
        Document doc = parserData();
        ArrayList<Node> result = new ArrayList<>();
        NodeList listSt = doc.getElementsByTagName("Student");
        for (int i = 0; i < listSt.getLength(); i++) {
            Node st = listSt.item(i);
            NodeList childSt = st.getChildNodes();
            for (int j = 0; j < childSt.getLength(); j++) {
                String text = childSt.item(j).getTextContent();
                if (text.startsWith(name) || text.endsWith(name)) {
                    //System.out.println(childSt.item(j).getTextContent());
                    result.add(childSt.item(i).getParentNode());
                }
            }
        }
        return result;
    }

    private static ArrayList<Node> searchByName(String name) {
        Document doc = parserData();
        ArrayList<Node> result = new ArrayList<>();
        NodeList listSt = doc.getElementsByTagName("StudentName");
        for (int i = 0; i < listSt.getLength(); i++) {
            String text = listSt.item(i).getTextContent();
            if (text.startsWith(name) || text.endsWith(name)) {
                //      System.out.println(text);
                result.add(listSt.item(i).getParentNode());
            }
        }
        return result;
    }

    public static Node searchById(String name, Document doc) {
        ArrayList<Node> result = new ArrayList<>();
        NodeList listSt = doc.getElementsByTagName("StudentID");
        for (int i = 0; i < listSt.getLength(); i++) {
            String text = listSt.item(i).getTextContent();
            if (text.startsWith(name) || text.endsWith(name)) {
                //      System.out.println(text);
                Node p = listSt.item(i).getParentNode();
                return p;
            }
        }
        return null;
    }

    private static void saveData(Document doc, String paths) {
        try {
            DOMSource source = new DOMSource(doc);
            File f = new File(paths);
            Result result = new StreamResult(f);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println(" Save success " + paths);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void printSearch(String name) {
        DOMModel.parserData();
        ArrayList<Node> result = DOMModel.searchByName(name);
        for (int i = 0; i < result.size(); i++) {
            Node st = result.get(i);
            System.out.print(st.getNodeName());
            NodeList childSt = st.getChildNodes();
            for (int j = 0; j < childSt.getLength(); j++) {
                System.out.print(childSt.item(j).getTextContent());
            }
            System.out.print("");
        }
    }

    public static void deleteDOM(String path, String id) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            Node delNode = DOMModel.searchById(id, doc);
            Node parent = delNode.getParentNode();
            parent.removeChild(delNode);
            DOMModel.saveData(doc, path);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOMModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
