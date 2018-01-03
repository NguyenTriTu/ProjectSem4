/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Apple
 */
public class TaoDom {

    public void taonode(String rootName, int soluongElement) {
        Scanner sc = new Scanner(System.in);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement(rootName);
            for (int i = 0; i < soluongElement - 1; i++) {
                String element = "";
                System.out.println("Create element");
                element = sc.nextLine();

                Element element1 = doc.createElement(element);
                Text eValue = doc.createTextNode("A001");
                element1.appendChild(eValue);
            }
            doc.appendChild(root);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TaoDom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
