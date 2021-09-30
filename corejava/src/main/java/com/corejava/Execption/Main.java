package com.corejava.Execption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // we call from main method
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x ,y)); // exception had occurred but try catch controlled it
//        System.out.println(divide(x,y)); // it get crashes we get error because exception is not handled
//        // 98/0 = Error
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }
    private static int getInt(){
        Scanner s = new Scanner(System.in); // it takes only Integers
        return s.nextInt();
    }
    private static int getIntLBYL() {
        Scanner s =new Scanner(System.in); // for input
        boolean isValid = true;
        System.out.println(" Please enter an integer"); // ask to user
        String input = s.next();
        for(int i = 0; i<input.length();i++) { // for validation
            if (!Character.isDigit(input.charAt(i))) { // data should be only Integers if not loops ends
                //it return zero

                isValid = false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }
        private  static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }

    }

     private static int divideLBYL(int x, int y) { // method and pass 2 integers
        if (y !=0){ // we can't divide by zero ,so we can have error
            return x / y;
        }else {
            return 0;
        }
     }

     private static int divideEAFP(int x, int y) { // for exception
        try {
            return x / y; // with same expression
         } catch (ArithmeticException e) {
            return 0;
        }
     }
     private static int divide(int x, int y) {
        return x /y;
     }
}
