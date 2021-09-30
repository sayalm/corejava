package com.sayal.masterclass.task;

import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner for importing from user.....//we can direct declare str also
        System.out.println("Enter your String");//User string is taken
        String str=sc.next();// method of Scanner class input string from user is stored in str
       // String org_str=str;// Again stored in org_str for if/else

        String rev="";  //String is reversed
       //It calculates the length of the string and stored in len variable for for-loop
      int len = str.length();
     for (int i=len-1; i>=0; i--)
          {                 // len is calculated and reversed 1 by on and stored in rev...its stops after len is 0
          rev = rev + str.charAt(i);   // all str is reverse and add side by side stored in rev
          }
          System.out.println(rev); // for checking if the string is reversed or not
        //Now after reverse is made then it is compared with original
        //str (org_str=rev) then if equals than its palindrome
         if (str.equals(rev)){
                System.out.println(str +  " is palindrome string");
        }else {
                System.out.println(str +  " is not palindrome string");
         }

    }
}
