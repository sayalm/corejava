/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commandexample.command;

/**
 *
 * @author User
 */
public class SubCommand extends Command{

    @Override
    public double execute(double x, double y) {
            return x-y;
    }
    
}
