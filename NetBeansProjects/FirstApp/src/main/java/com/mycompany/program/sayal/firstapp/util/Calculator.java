/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.firstapp.util;

/**
 *
 * @author User
 */
public class Calculator {
    public double add(double x, double y){
        return x+y;
    }
    
    public double sub(double x, double y){
        return x-y;
    }  
    
    public double mul(double x, double y){
        return x*y;
    }
    
    public double div(double x, double y){
        return x/y;
    }   
    
    public double power(double x, double y){
        double total=1;
        
        for(int i=1;i<=y;i++){
            total = total* x;
        }
        return total;
    }
    
}
