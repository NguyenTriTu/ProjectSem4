/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.com.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Apple
 */
public class Login extends ActionSupport {

    private String userName;
    private String password;

    public Login() {
    }

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if (getUserName().length() == 0) {
            addFieldError("userName", "User Name is required");
        } else if (!getUserName().equals("admin")) {
            addFieldError("userName", "Invalid User");
        }
        if (getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        } else if (!getUserName().equals("admin")) {
            addFieldError("userName", "Invalid Pass");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
