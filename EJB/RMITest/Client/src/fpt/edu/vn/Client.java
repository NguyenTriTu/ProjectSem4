/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu.vn;

import function.LoginInterface;
import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String str = "rmi://localhost:1099/HelloServer";
//lookup for the name helloserver in the rmi registry
            System.out.println("Finding object ...");
            LoginInterface objReference = (LoginInterface) Naming.lookup(str);
//invoke the remote method, and assign the result to a strong
            Scanner sc = new Scanner(System.in);
            boolean Result = false;
            do {
                System.out.println("Enter admin name : ");
                String admin = sc.nextLine();
                System.out.println("Enter pass name : ");
                String pass = sc.nextLine();
                Result = objReference.checkLogin(admin, pass);
                System.out.println("Result: " + Result);
            } while (!Result); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
