/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Book;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Apple
 */
public class BookDAO {

    public final String XML_URIL = "http://localhost:8080/ASM/data/Data.xml";
    public ArrayList<Book> getBook() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(XML_URIL);
            XPath xPath = XPathFactory.newInstance().newXPath();
            NodeList nl = (NodeList) xPath.evaluate("//Book", doc, XPathConstants.NODESET);
            for (int i = 0; i < nl.getLength(); i++) {
                NodeList child = nl.item(i).getChildNodes();
                Book book = new Book();
                for (int j = 0; j < child.getLength(); j++) {
                    if (child.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) child.item(j);
                        String textContent = child.item(j).getTextContent();
                        switch (e.getTagName()) {
                            case "bookId":
                                book.setBookId(Integer.parseInt(textContent));
                                break;
                            case "title":
                                book.setTitle(textContent);
                                break;
                            case "price":
                                book.setPrice(Integer.parseInt(textContent));
                                break;
                            case "description":
                                book.setDescription(textContent);
                                break;
                            case "dateTime":
                                book.setDateTime(textContent);
                                break;
                            case "image":
                                book.setImage(textContent);
                                break;
                        }
                    }
                }
                books.add(book);
            }
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            ex.getMessage();
        }
        return books;
    }
}
