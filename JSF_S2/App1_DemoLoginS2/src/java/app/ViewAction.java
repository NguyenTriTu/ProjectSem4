/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class ViewAction extends ActionSupport {

    private ArrayList items;

    public ViewAction() {
    }

    public String execute() throws Exception {
        return "success";
    }

    public ArrayList getItems() {
        DataProcess dt = new DataProcess();
        items = dt.getData();
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

}
