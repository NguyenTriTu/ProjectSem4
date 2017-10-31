package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Apple
 */
@Named(value = "accountBean")
@Dependent
@ManagedBean
public class AccountBean {

    /**
     * Creates a new instance of AccountBean
     */
    public AccountBean() {
    }
    
}
