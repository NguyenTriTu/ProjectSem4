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
public class LoginAction extends ActionSupport {

    private String user;
    private String pass;

    public LoginAction() {
    }

    public String execute() throws Exception {
        if (DataProcess.checkLogin(user, pass)) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
