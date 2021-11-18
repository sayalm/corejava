/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatserver;

/**
 *
 * @author User
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.chatserver.util.ClientListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        int port = 9000;
        try {
            ServerSocket server = new ServerSocket(port);
             System.out.println("Server is running at" + port);
            while(true) {
                Socket socket= server.accept();
                 System.out.println("Connection Request Detected from" + socket.getInetAddress().getHostAddress());
                 ClientListener listener = new ClientListener(socket);
                 listener.start();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
           
        }
    }
}
