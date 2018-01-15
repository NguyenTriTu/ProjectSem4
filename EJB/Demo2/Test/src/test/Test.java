/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import app.MaiSessionBeanRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

/**
 *
 * @author Apple
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        Object obj = ctx.lookup("mrBean");
        MaiSessionBeanRemote remote = (MaiSessionBeanRemote) PortableRemoteObject.narrow(obj, MaiSessionBeanRemote.class);
        MaiSessionBeanRemote.Product dt = remote.getP();
        System.out.println(dt.getMasach());
    }

}
