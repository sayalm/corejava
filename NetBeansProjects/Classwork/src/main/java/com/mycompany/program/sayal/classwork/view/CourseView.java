/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.classwork.view;

import com.mycompany.program.sayal.classwork.dao.CourseDAO;
import com.mycompany.program.sayal.classwork.entity.Course;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CourseView {
    private Scanner input;
    private CourseDAO courseDAO;

    public CourseView(Scanner input, CourseDAO courseDAO) {
        this.input = input;
        this.courseDAO = courseDAO;
    }

    private void menu() {
        System.out.println("Course Information");
        System.out.println("1. Add Course");
        System.out.println("2. Show All Courses");
        System.out.println("3. Back");
        System.out.println("Enter your Choice[1-3]:");
    }

    private void addScreen() {
        while(true){
        Course c=new Course();
        System.out.println("Enter Course Id");
        c.setId(input.nextInt());
        System.out.println("Enter Course Name:");
        c.setName(input.next());
        System.out.println("Enter Course Description");
        c.setDescription(input.nextLine());
        
        courseDAO.insert(c);
            System.out.println("Do you want to continue[Y/N]:");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
        
    }

    private void showAllScreen() {
        System.out.println("Listing all courses");
        courseDAO.getAll().forEach(c->{
            System.out.println(c.toString());
        });
    }

    public void controller() {
        boolean back=false;
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    addScreen();
                    break;
                case 2:
                    showAllScreen();
                    break;
                case 3:
                    back=true;
                    break;
            }
            
            if(back){
                break;
            }
        }
    }
}
