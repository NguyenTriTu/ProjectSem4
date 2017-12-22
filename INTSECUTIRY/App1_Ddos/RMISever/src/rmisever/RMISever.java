/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmisever;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import newpackage.SeverInterface;

/**
 *
 * @author Apple
 */
public class RMISever extends UnicastRemoteObject implements SeverInterface {

    /**
     * @param x
     * @param y
     * @throws java.rmi.RemoteException
     */
    public RMISever() throws RemoteException {
        super();
    }

    @Override
    public void requestFrame(int x, int y) throws RemoteException {
        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setSize(300, 200);
        f.setLocation(x, y);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            RMISever s = new RMISever();
            LocateRegistry.createRegistry(1089);
            String url = "rmi://localhost:1089/mysever";
            Naming.rebind(url, s);
            System.out.println("Sever is running and listening on port 1089 ...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
