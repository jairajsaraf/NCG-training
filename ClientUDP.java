package com.example.training;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ClientUDP {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramSocket datagramSocket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            String echoString;

            do{
                System.out.println("Enter string to be echoed : ");
                echoString = sc.nextLine();

                byte[] buffer = echoString.getBytes();
                byte[] buffer2 = new byte[50];

                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, inetAddress, 5000);
                datagramSocket.send(packet);
                DatagramPacket packet1 = new DatagramPacket(buffer2, buffer2.length);
                datagramSocket.receive(packet1);
                System.out.println("Text received : " + new String(buffer2, 0, packet1.getLength()));
            }while(!echoString.equalsIgnoreCase("exit"));

        }
        catch(SocketTimeoutException e){
            System.out.println("Socket timed out.");
        }
        catch(IOException e){
            System.out.println("Client error : "+ e.getMessage());
        }

    }
}
