/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commandexample.command;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class CommandFactory {
    private HashMap<String,Command> commands=initialise();
    
    private HashMap<String,Command> initialise() {
        HashMap<String,Command> c= new HashMap<>();
        c.put("+", new AddCommand());
        c.put("-", new SubCommand());
        c.put("*", new MulCommand());
        c.put("/", new DivCommand());
        
        c.put("|", new MaxCommand());
       
        return c;
    }
    public Command getCommand(String key) {
        if(isCommand(key)){
            return (Command)commands.get(key);
        }
        return null;
    }
    public Boolean isCommand(String key){
        return commands.containsKey(key);
        
    }
}
