/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Apple
 */
public interface LoginInterface extends Remote {

    public boolean checkLogin(String ad, String pass) throws RemoteException;
}
