/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vuong.com.dto.Product;
import vuong.com.utils.CommonUtils;
import vuong.com.utils.defineVar;

/**
 *
 * @author vuongnguyen
 */
public class ProductAction extends ActionSupport {

    List<Product> lstPro;

    public List<Product> getLstPro() {
        return lstPro;
    }

    public void setLstPro(List<Product> lstPro) {
        this.lstPro = lstPro;
    }

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }
    private Product pro;

    @Override
    public String execute() throws Exception {
        if (this.pro != null) {
            //get list produc form xml
            List<Product> lstPro = CommonUtils.getAllProductFromXML();
            if (lstPro == null) {
                lstPro = new ArrayList<>();
            } else {
                for (Iterator<Product> iter = lstPro.listIterator(); iter.hasNext();) {
                    Product product = iter.next();
                    if (this.pro.getId().equalsIgnoreCase(product.getId())) {
                        iter.remove();
                        break;
                    }
                }

            }
            lstPro.add(this.pro);
            this.lstPro = lstPro;

            CommonUtils.writeListProductToXML(lstPro, new File(defineVar.PATH_FILE));
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
