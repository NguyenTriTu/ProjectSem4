package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Apple
 */
public interface SeverInterface extends Remote{
      public void requestFrame(int x, int y) throws RemoteException;
}
