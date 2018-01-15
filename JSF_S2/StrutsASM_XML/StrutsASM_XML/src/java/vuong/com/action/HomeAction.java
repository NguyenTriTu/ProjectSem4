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
public class HomeAction extends ActionSupport{
    private List<Product> lstPro;

    public List<Product> getLstPro() {
        return lstPro;
    }

    public void setLstPro(List<Product> lstPro) {
        this.lstPro = lstPro;
    }

    @Override
    public String execute() throws Exception {
        List<Product> pro = CommonUtils.getAllProductFromXML();
        setLstPro(pro);
        return SUCCESS;
    }
}
