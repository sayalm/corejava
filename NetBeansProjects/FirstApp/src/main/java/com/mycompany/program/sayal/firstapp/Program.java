/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.firstapp;

import com.mycompany.program.sayal.firstapp.command.MathCommand;
import com.mycompany.program.sayal.firstapp.command.MathFactory;
import com.mycompany.program.sayal.firstapp.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

     
    private static void menu(){
        System.out.println("+. Add");
        System.out.println("-. Sub");
        System.out.println("*. Mul");
        System.out.println("/. Div");
        System.out.println("^. Power");
        System.out.println("Enter your choice:");
    }
    
    public static void showConfirmDialog(Scanner input){
        System.out.println("Do you want to continue[Y/N] ");
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
        }        
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, total = 0;
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter First number:");
            x = input.nextInt();
            System.out.println("Enter Second number:");
            y = input.nextInt();

            menu();
           
            //total=calculate(x,y,input.nextInt());
            
            
            
            MathCommand cmd=MathFactory.get(input.next());
            if(cmd!=null){

            System.out.println(cmd.calculate(x, y));
            }
            else{
                System.out.println("Invalid command");
            }
            
            showConfirmDialog(input);

        }
    }

}
