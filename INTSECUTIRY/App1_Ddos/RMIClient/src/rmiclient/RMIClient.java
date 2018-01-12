/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import java.rmi.Naming;
import java.util.Scanner;
import newpackage.SeverInterface;

/**
 *
 * @author Apple
 */
public class RMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String url = "rmi://localhost:1089/mysever";

        try {
            int x = 10, y = 10;
            SeverInterface s = (SeverInterface) Naming.lookup(url);

            while (2 > 1) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if (a == 1) {
                    s.requestFrame(x, y);
                    x++;
                    y++;
                    if (x == 300) {
                        x = 10;
                    }
                    if (y == 500) {
                        y = 10;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
