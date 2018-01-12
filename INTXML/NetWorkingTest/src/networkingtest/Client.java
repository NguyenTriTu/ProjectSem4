/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkingtest;

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
        DatagramSocket ds = new DatagramSocket();
        String str = "hello world";
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ia, 3000);
        ds.send(dp);
        ds.close();
    }
}
