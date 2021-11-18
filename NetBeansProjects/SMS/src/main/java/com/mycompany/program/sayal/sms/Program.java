/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.sms;
import com.mycompany.program.sayal.sms.dao.StudentDAO;
import com.mycompany.program.sayal.sms.dao.impl.StudentDAOImpl;
import com.mycompany.program.sayal.sms.entity.Student;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
 /*       
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl(new ArrayList<>());
        Scanner input = new Scanner(System.in);
        
        
        
        
        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show All students");
            System.out.println("3. Search Student by Id");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice[1-4]:");
      
            switch(input.nextInt()) {
                case 1:
                    while(true){
                     Student student = new Student();
                     System.out.println("Enter Id:");
                     student.setId(input.nextInt());
                     
                    System.out.println("Enter First Name:");
                    student.setFirstName(input.next());
                    
                    System.out.println("Enter Last Name:");
                    student.setLastName(input.next());
                    
                    System.out.println("Enter Email:");
                    student.setEmail(input.next());
                    
                    System.out.println("Enter ContactNo:");
                    student.setContactNo(input.next());
                    
                    System.out.println("Enter Status:");
                    student.setStatus(input.nextBoolean());
                    
                    studentDAO.insert(student);
                    
                        System.out.println("Do you want to Add More [Y/N]");
                        if(input.next().equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    
                case 2:
                    studentDAO.getAll().forEach((s->{
                        System.out.println(s);
                    }));
                    System.out.println("Press Any key to continue");
                    
                    input.next();
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
         
    }
    
}
