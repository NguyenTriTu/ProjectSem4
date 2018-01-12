/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Apple
 */
public class ViewAction extends ActionSupport {

    private String item = "ViewAction";

    public ViewAction() {
    }

    public String execute() throws Exception {
        return "success";
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
