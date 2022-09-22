package com.example.training;

import java.io.IOException;
import java.net.*;

public class ServerUDP {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(5000);

            while(true){
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                System.out.println("Text received : " + new String(buffer, 0, packet.getLength()));
                String returnString = "Echo : " + new String(buffer, 0, packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress inetAddress = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer2, buffer2.length, inetAddress, port);
                socket.send(packet);

            }

        }
        catch(SocketException e){
            System.out.println("SocketException Message : " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("IOException Message : " + e.getMessage());
        }
    }
}
