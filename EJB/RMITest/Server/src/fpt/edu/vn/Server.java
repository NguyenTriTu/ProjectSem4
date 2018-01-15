/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu.vn;

import function.LoginCheck;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Apple
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

//create an instance if the implementation class
            LoginCheck remoteObject = new LoginCheck();
            System.out.println("Exporting HelloServer ...");
//Listen on default RMIRegistry port 1099
            Registry regis = LocateRegistry.createRegistry(1099);
//Binds the remote object with a name in the registry
            Naming.rebind("rmi://localhost:1099/HelloServer",
                    remoteObject);
            System.out.println("Register Calculator.");
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

}
