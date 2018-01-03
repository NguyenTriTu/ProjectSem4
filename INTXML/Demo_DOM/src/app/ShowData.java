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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Apple
 */
public class ShowData {
    public void disPlay() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            String path = "src\\app\\Data.xml";
            DocumentBuilder builder = dbf.newDocumentBuilder();
            File f = new File(path);
            Document doc = builder.parse(f); // load xml structure in to bo nho
            //Lay ve danh sach cac product
            NodeList prList = doc.getElementsByTagName("Student");
            System.out.println("List Student");
            System.out.println("StudentID\tStudentName\tMark\t\tGender");
            //Lap qua tung nut Product va lay noi dung
            for (int i = 0; i < prList.getLength(); i++) {
                // lay ve tung nut Student
                Node temp = prList.item(i);
                // lap qua cac nut con của Student va in noi dung
                NodeList child = temp.getChildNodes();

                for (int j = 0; j < child.getLength(); j++) {
                    // loai bo phan tu ket thuc
                    if (!child.item(j).getNodeName().equals("#text")) {
                        System.out.print(child.item(j).getTextContent() + "\t\t");
                    }
                }
                System.out.println("");
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
