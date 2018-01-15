/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.com.utils;

import java.util.ArrayList;
import java.util.List;
import vuong.com.dto.Product;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.SAXException;
/**
 *
 * @author vuongnguyen
 */
public class CommonUtils {
    public static List<Product> getAllProductFromXML(){
        List<Product> lstProduct = new ArrayList<>();
        try {
            File inputFile = new File("D://product.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Product");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                Product pro = new Product();
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;                   
                    pro.setId(eElement.getElementsByTagName("Id").item(0).getTextContent());
                    pro.setName(eElement.getElementsByTagName("Name").item(0).getTextContent());
                    pro.setQuantity(eElement.getElementsByTagName("Quantity").item(0).getTextContent());
                    pro.setPrice(Double.parseDouble(eElement.getElementsByTagName("Price").item(0).getTextContent())); 
                    lstProduct.add(pro);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(CommonUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
      return lstProduct;
    }
    
    public static boolean writeListProductToXML(List<Product> lstPro, File file){
    try {
         DocumentBuilderFactory dbFactory =
         DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         //add elements to Document
            Element rootElement =
                doc.createElementNS("vuong.com.product","root");
            //append root element to document
            doc.appendChild(rootElement);
       
         // product element
         for(Product pro : lstPro){
           
           rootElement.appendChild(getProduct(doc, pro.getId(), pro.getName(),pro.getQuantity(),String.valueOf(pro.getPrice())));
      
         }
         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(file);
         transformer.transform(source, result);
         
         // Output to console for testing
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
         return false;
      }
    return true;
    }
    
    
    private static Node getProduct(Document doc, String id, String name, String quantity, String price
           ) {
        Element product = doc.createElement("Product");

        //set id attribute
        product.appendChild(getEmployeeElements(doc, product, "Id", id));

        //create name element
        product.appendChild(getEmployeeElements(doc, product, "Name", name));

        //create quantity element
        product.appendChild(getEmployeeElements(doc, product, "Quantity", quantity));

        //create price element
        product.appendChild(getEmployeeElements(doc, product, "Price", price));
      
        return product;
    }


    //utility method to create text node
    private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
    public static Node searchById(String id, Document doc){
        NodeList lst = doc.getElementsByTagName("Id");
        for(int i = 0; i<lst.getLength();i++){
            String content = lst.item(i).getTextContent();
            if(content.equalsIgnoreCase(id)){
                Node p = lst.item(i).getParentNode();
                return p;
            }
        }
        return null;
    }
    public static void SaveData (Document doc, String path){
        try {
            DOMSource source = new DOMSource(doc);
            File f = new File(path);
            Result result = new StreamResult(f);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            
        } catch (TransformerException ex) {
            Logger.getLogger(CommonUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
