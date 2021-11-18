/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordhelper.program.commonexample;

import Commandexample.command.Command;
import Commandexample.command.CommandFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) throws IOException {
        CommandFactory factory = new CommandFactory();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter num1:");
        double x = Double.parseDouble(reader.readLine());
        
        System.out.println("Enter num2:");
        double y = Double.parseDouble(reader.readLine());
        
        
        System.out.println("1. Press + for Add");
        System.out.println("2. Press - for Sub");
         System.out.println("3. Press * for Mul");
          System.out.println("4. Press / for Div");
          System.out.println("5. Press | for Div");
          
          String command = reader.readLine();
          
        Command c = factory.getCommand(command);
        if(c!=null) {
        System.out.println(c.execute(x,y));
        
    }
        else {
            System.out.println(command + "Not found");
        }
    
}
}
 