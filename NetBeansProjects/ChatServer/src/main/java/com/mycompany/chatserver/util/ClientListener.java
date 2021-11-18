/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatserver.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author User
 */
public class ClientListener extends Thread{
    private Socket socket;
    private BufferedReader input;
    private PrintStream output;
    
    public ClientListener(Socket socket) throws IOException {
        this.socket = socket;
        output = new PrintStream(socket.getOutputStream());
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
    }

    @Override
    public void run() {
      try{
          
                output.println("Welcome to SM server");
                output.println("Current System at server is"+ new Date().toString());
                
                output.println("Enter Your UserName");
                String userName = input.readLine(); 
                System.out.println(userName+ "has logged in");
                output.println("Thank You" + userName);
          
      }catch(IOException ioe){
          
      }
    }
    
    
    
}
