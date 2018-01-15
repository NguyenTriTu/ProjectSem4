/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import vuong.com.dto.Product;
import vuong.com.utils.CommonUtils;

/**
 *
 * @author vuongnguyen
 */
public class EditProductAction extends ActionSupport{
    private String id;
    
    Product pro;  

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        List<Product> lstPro = CommonUtils.getAllProductFromXML();
            for(Product pro1 : lstPro){
                if(pro1.getId().equalsIgnoreCase(this.id)){
                    this.pro = pro1;
                    break;
                }
            }
          
        return SUCCESS;
    }
    
    
}
