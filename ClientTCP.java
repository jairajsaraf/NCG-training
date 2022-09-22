package com.example.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5000)){
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter strToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String echoStr, response;

            do{
                System.out.println("Enter string to be echoed :");
                echoStr = sc.nextLine();

                strToEcho.println(echoStr);
                if(!echoStr.equalsIgnoreCase("exit")){
                    response = echoes.readLine();
                    System.out.println(response);
                }
            }while(!echoStr.equalsIgnoreCase("exit"));


        }
        catch(IOException e){
            System.out.println("Client error : " + e.getMessage());
        }

    }
}
