/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Apple
 */
public class UserBean {

    @EJB
    private TblUserFacade tblUserFacade;

    private String userName;
    private String pass;

    private List<TblUser> items;

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    public String createUser() {
        TblUser user = new TblUser();
        user.setUsername(userName);
        user.setPassword(pass);
        tblUserFacade.create(user);
        return "success";

    }

    public String editUser(String username) {
        TblUser userNew = new TblUser();

        userNew = tblUserFacade.findUser(username);
        userName = userNew.getUsername();
        pass = userNew.getPassword();
        return "edited";
    }

    public String updateUser() {
        TblUser user = new TblUser();
        user.setUsername(userName);
        user.setPassword(pass);
        tblUserFacade.edit(user);
        return "Updated";
    }

    public String deleteUser(String username, String password) {
        TblUser user = new TblUser();
        user.setUsername(username);
        user.setPassword(password);
        tblUserFacade.remove(user);
        items = tblUserFacade.viewAll();
        return "deleted";

    }

    public List<TblUser> getItems() {
        items = tblUserFacade.viewAll();
        return items;
    }

    public void setItems(List<TblUser> items) {
        this.items = items;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
