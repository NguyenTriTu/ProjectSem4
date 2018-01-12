/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu.vn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Apple
 */
public class Server {

    public static void main(String[] args) throws SocketException, IOException {
        int PORT = 4000;
        byte[] buf = new byte[1000];
        DatagramPacket dgp = new DatagramPacket(buf, buf.length);
        DatagramSocket sk;

        sk = new DatagramSocket(PORT);
        System.out.println("Server started");
        while (true) {
            sk.receive(dgp);
            String rcvd = new String(dgp.getData(), 0, dgp.getLength()) + ", from address: "
                    + dgp.getAddress() + ", port: " + dgp.getPort();
            System.out.println(rcvd);

            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String outMessage = stdin.readLine();
            buf = ("Server say: " + outMessage).getBytes();
            DatagramPacket out = new DatagramPacket(buf, buf.length, dgp.getAddress(), dgp.getPort());
            sk.send(out);
        }
    }
}
