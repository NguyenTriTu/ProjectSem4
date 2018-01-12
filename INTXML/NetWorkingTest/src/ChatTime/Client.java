/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Apple
 */
public class Client {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket s = new DatagramSocket();
        byte[] buf = new byte[1000];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        InetAddress hostAddress = InetAddress.getByName("localhost");
        while (true) {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String outMessage = stdin.readLine();

            if (outMessage.equals("bye")) {
                break;
            }
            String outString = "Client say: " + outMessage;
            buf = outString.getBytes();

            DatagramPacket out = new DatagramPacket(buf, buf.length, hostAddress, 4000);
            s.send(out);

            s.receive(dp);
            String rcvd = "rcvd from " + dp.getAddress() + ", " + dp.getPort() + ": "
                    + new String(dp.getData(), 0, dp.getLength());
            System.out.println(rcvd);
        }
    }
}
