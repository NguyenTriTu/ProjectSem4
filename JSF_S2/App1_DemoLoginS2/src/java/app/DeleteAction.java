/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class DeleteAction extends ActionSupport {

    private String id;

    public DeleteAction() {
    }

    public String execute() throws Exception {
        DataProcess dt = new DataProcess();
        if(dt.deleteBook(id))
            return "success";
        return "failed";
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
