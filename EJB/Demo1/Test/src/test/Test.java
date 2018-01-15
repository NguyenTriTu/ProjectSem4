/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import app.MaiSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static void main(String[] args) {
        try {
            Context ctx=new InitialContext();
            Object obj=ctx.lookup("mrBean");
            MaiSessionBeanRemote remote=(MaiSessionBeanRemote)PortableRemoteObject.narrow(obj, MaiSessionBeanRemote.class);
            System.out.println(remote.add(13, 11));
        } catch (NamingException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
