package com.example.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerTCP {
    public static void main(String[] args){
        try(ServerSocket serverSocket = new ServerSocket(5000)){
            Socket socket = serverSocket.accept();
            System.out.println("Client connected successfully...");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            while(true){

                String echoStr = input.readLine();
                try{
                    Thread.sleep(30000);
                }catch(InterruptedException e){
                    System.out.println("Thread interrupted.");
                }
                if(echoStr.equalsIgnoreCase("exit")){
                    break;
                }
                output.println("Echo from server : " + echoStr);
            }

        }
        catch (IOException e) {
            System.out.println("Server message : " + e.getMessage());
        }
    }
}
