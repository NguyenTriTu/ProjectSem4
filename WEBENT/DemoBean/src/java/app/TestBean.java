/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Apple
 */
public class TestBean {

    private String user;
    private String pass;

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

    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {

    }

    public String checLogin(){
        if("admin".equalsIgnoreCase(user)&&"123".equals(pass)){
            return "success";
        }else{
            return "failed";
        }
    }
}
