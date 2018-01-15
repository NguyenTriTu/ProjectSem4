/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import vuong.com.dto.Product;
import vuong.com.utils.CommonUtils;
import vuong.com.utils.defineVar;

/**
 *
 * @author vuongnguyen
 */
public class DeleteProductAction extends ActionSupport{
    private String id;
    private List<Product> lstPro;

    public List<Product> getLstPro() {
        return lstPro;
    }

    public void setLstPro(List<Product> lstPro) {
        this.lstPro = lstPro;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
         try {
          
            DocumentBuilderFactory dbFactory =
            DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(defineVar.PATH_FILE));
            Node deleNode = CommonUtils.searchById(this.id, doc);
            doc.getDocumentElement().removeChild(deleNode);
            CommonUtils.SaveData(doc, defineVar.PATH_FILE);
            List<Product> lstPro = CommonUtils.getAllProductFromXML();
            this.lstPro = lstPro;                  
        } catch (ParserConfigurationException | SAXException ex) {
            
          return ERROR;
        }
        return SUCCESS;
    }
}
