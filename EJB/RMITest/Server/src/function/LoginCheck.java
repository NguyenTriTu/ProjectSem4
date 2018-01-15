/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Apple
 */
public class LoginCheck extends UnicastRemoteObject implements LoginInterface {

    public LoginCheck() throws RemoteException {
        super();
    }

    @Override
    public boolean checkLogin(String ad, String pass) throws RemoteException {
        boolean a = false;
        if (ad.equals("admin") && pass.equals("123")) {
            a = true;
        }
        return a;
    }

}
