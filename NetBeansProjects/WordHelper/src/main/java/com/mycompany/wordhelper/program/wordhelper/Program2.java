/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordhelper.program.wordhelper;

/**
 *
 * @author User
 */
public class Program2 {
    public static void main(String[] args) {
        String p = "We are into very bad Weather. Everyone is feeling gloomy";
        
        int words = 1;
        int vowels = 0;
        
        for(int i=0; i<p.length();i++){
            char c = p.toLowerCase().charAt(i); 
     
            if(c == ' '){
                words++;
            }
            
            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
        }
            else{
                 
            }
        }
            System.out.println("Total vowels "+ vowels);
         System.out.println("Total words " + words);
    }
    
}
