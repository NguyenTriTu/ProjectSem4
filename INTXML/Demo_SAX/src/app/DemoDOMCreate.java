/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Apple
 */
public class DemoDOMCreate {

    public static void main(String[] args) {
        String path = "src\\app\\StudentInfor.xml";
        File f = new File(path);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("StudentList");
            Element student = doc.createElement("Student");
            Element id = doc.createElement("StudentID");
            Text idValue = doc.createTextNode("A001");
            id.appendChild(idValue);
            Element name = doc.createElement("StudentName");
            Text nameValue = doc.createTextNode("Demo");
            name.appendChild(nameValue);
            Element mark = doc.createElement("Mark");
            Text markValue = doc.createTextNode("20");
            mark.appendChild(markValue);
            student.appendChild(id);
            student.appendChild(name);
            student.appendChild(mark);
            root.appendChild(student);
            doc.appendChild(root);
            //System.out.println(doc.getDocumentElement().getTextContent());
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            try {
                Transformer transformer = transformerFactory.newTransformer();
                StreamResult result = new StreamResult(f);
                DOMSource source = new DOMSource(doc);
                try {
                    transformer.transform(source, result);
                    System.out.println("write success tep tin ");
                } catch (TransformerException ex) {
                    Logger.getLogger(DemoDOMCreate.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(DemoDOMCreate.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DemoDOMCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
