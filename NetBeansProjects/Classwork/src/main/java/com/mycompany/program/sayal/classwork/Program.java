/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.classwork;

import com.mycompany.program.sayal.classwork.dao.CourseDAO;
import com.mycompany.program.sayal.classwork.dao.impl.CourseDAOImpl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CourseDAO courseDAO = new CourseDAOImpl(new ArrayList<>());
        menu();

        switch(input.nextInt()) {
            case 1:
                break;
            case 2:

                break;
            case 3: //insert Article
              Article article = getUserInput();
              // Insert Article into DataBase

                }
                break;
            case 4:
                System.exit(0);
                break;
        }
        
    }
    private static void menu() {
        System.out.println("Welcome to Sayal Academy");
        System.out.println("1. Course");
        System.out.println("2. Mentors");
        System.out.println("3. students");
        System.out.println("4. Exit");
        System.out.println("Enter your Choice[1-4]:");
    }
    private static Article getUserInput() {
        System.out.println("Insert Article details");
        Article article = new Article();
        System.out.println(" insert Title");
        article.setTitle()//take user input
                ....
        System.out.println("Insert no of authors");
        int no_of_authors = input.nextInt();
        List<Author> authorList = new ArrayList<>();

        for(int i = 0; i<no_of_authors; i++) {

            Author author = new Author();
            System.out.println("Insert firstName");
            author.setFirstName(input.) //take user input
                    ....
            authorList.add(author);

        }
        article.setAuthors(authorList);
        return article;

    }


}

