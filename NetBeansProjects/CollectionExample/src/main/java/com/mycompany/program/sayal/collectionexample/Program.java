/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.collectionexample;

import com.mycompany.program.sayal.collectionexample.entity.Student;
import com.mycompany.program.sayal.collectionexample.service.StudentService;
import com.mycompany.program.sayal.collectionexample.service.iimpl.StudentServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        StudentService studentService= new StudentServiceImpl();
        
        System.out.println("1. Add");
        System.out.println("2. GetAll");
        System.out.println("3. Exit");
        System.out.println("Enter your Choice[1-3]");
        
        Student s= new Student(1, "Suvha" ,"Shrestha","suvha@gmail.com",true);
        studentService.insert(s);
        
        studentService.insert(new Student(2, "Atman","Ashish","atman@gmail.com",true));
        
        studentService.delete(1);
        studentService.getAll().forEach(std->{
            System.out.println(std.toString());
        });
        

    
    }
}
