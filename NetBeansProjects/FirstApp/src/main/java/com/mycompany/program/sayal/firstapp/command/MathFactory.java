/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.program.sayal.firstapp.command;

/**
 *
 * @author Atman
 */
public class MathFactory {
    
    public static MathCommand get(String key){
        if(key.equals("+")){
            return new AddCommand();
        }
        else if(key.equals("-")){
            return new SubCommand();
        }
        else if(key.equals("*")){
            return new MulCommand();
        }
        else if(key.equals("/")){
            return new DivCommand();
        }
        else if(key.equals("^")){
            return new PowerCommand();
        }
        else if(key.equalsIgnoreCase("max")){
            return new MaxCommand();
        }        
        return null;
    }
    
}
