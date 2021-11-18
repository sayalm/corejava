/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordhelper.program.wordhelper;

/**
 *
 * @author User
 */
public class Program {

    public static void main(String[] args) {
//        int i, j;
//        i = 10;
//        System.out.println(i);
//        j = i++;
//        System.out.println(j + " j");
//        System.out.println(i++);
//        System.out.println(++i);
//        i++;
//        i++;
//        for(int row=1; row<=5; row++) {
//
//            for(int col=1; col<=row;col++){
//  //         System.out.println(i); // ln = print in next line
//               System.out.print(col);
//          }
//           System.out.println();
//       }
//        
//        for (int row=5; row>=1; row--){
//            for(int col= 1; col<=row;col++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        } 

        int age = 18;
        Boolean invitation = false;
        Boolean drunk = true;

        if (age >= 18) {
            if (drunk) {
                System.out.println("Throw him/her out of the bar");
            } else {
                System.out.println("Welcome to the Bar");
                if (invitation) {
                    System.out.println("Welcome to private Party");
                } else {
                    System.out.println("Your are not allowed to go to private party");
                }

                drunk = true; 
                if (drunk) {
                    System.out.println("Throw him/her out of the bar");
                }
            }
        } 
        else {
            System.out.println("Sorry you are too young");
        }
    }

}
