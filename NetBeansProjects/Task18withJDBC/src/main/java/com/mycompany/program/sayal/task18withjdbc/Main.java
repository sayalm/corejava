/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.task18withjdbc;

import com.mycompany.program.sayal.task18withjdbc.dao.ArticleDAO;
import com.mycompany.program.sayal.task18withjdbc.dao.AuthorDAO;
import com.mycompany.program.sayal.task18withjdbc.dao.impl.ArticleDAOImpl;
import com.mycompany.program.sayal.task18withjdbc.dao.impl.AuthorDAOImpl;
import com.mycompany.program.sayal.task18withjdbc.entity.Article;
import com.mycompany.program.sayal.task18withjdbc.entity.Author;
import com.mycompany.program.sayal.task18withjdbc.fileUtils.Filedownloader;
import com.mycompany.program.sayal.task18withjdbc.fileUtils.JsonReadFile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author User
 */
public class Main {

    private static void menu() {
        System.out.println("Welcome to Exhibition");
        System.out.println("1. Download file from URL");
        System.out.println("2. Insert Data to Database");
        System.out.println("3. Show Article from Database");
        System.out.println("4. Please Insert Article in Database");
        System.out.println("5. Search Article from an Author Name");
        System.out.println("6. Export all the Database records into JSON file");
        System.out.println("7. Exit");
        System.out.println("Enter your Choice[1-7]:");
    }

    private static Article getUserInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insert Article details");
            Article article = new Article();
            System.out.println("Please provide ArtricleId");
            article.setArticleId(input.nextInt());
            System.out.println("Please Insert Title");
            article.setTitle(input.next());//take user input
            System.out.println("Please Insert PublishedDate");
            article.setPublishedDate(input.next());
            System.out.println("Insert no of authors");
            int no_of_authors = input.nextInt();
            List<Author> authorList = new ArrayList<>();

            for (int i = 0; i < no_of_authors; i++) {
                Author author = new Author();
                System.out.println("Insert Id");
                author.setId(input.nextInt());
                System.out.println("Insert FirstName");
                author.setFirstName(input.next());//take user input
                System.out.println("Insert LastName");
                author.setLastName(input.next());
                System.out.println("Insert Address");
                author.setAddress(input.next());
                System.out.println("Insert Email");
                author.setEmail(input.next());
                System.out.println("Insert Contact Number");
                author.setContact(input.next());
                author.setArticleId(article.getArticleId());
                authorList.add(author);
            }
            article.setAuthors(authorList);
            return article;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ArticleDAO articleDAO = new ArticleDAOImpl();
        AuthorDAO authorDAO = new AuthorDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    Filedownloader.downloadFileFromUrl();
                    break;
                case 2:
                    //read content from json
                    List<Article> articleList = JsonReadFile.readJsonFile();
                    // insert read content to database
                    int authorCounter = 0;
                    //for loop article list
                    for (int i = 0; i < articleList.size(); i++) {
                        //take single article
                        Article article = articleList.get(i);
                        int articleId = i + 1; // 1- 2
                        article.setArticleId(articleId);
                        //insert article title and published date on db
                        articleDAO.insert(article);
                        // take authorlist
                        List<Author> authorList = article.getAuthors();
                        //for loop authorlist
                        for (int j = 0; j < authorList.size(); j++) {
                            authorCounter += 1;// 1 , 2, -3 , 4
                            Author author = authorList.get(j);
                            int authorId = authorCounter; //1 , 2 -3 , 4
                            author.setArticleId(articleId);
                            author.setId(authorId);
                            //insert author details in data base
                            authorDAO.insert(author);
                        }
                    }
                    break;
                case 3:
                    List<Article> articleList1 = articleDAO.getALL();
                    articleList1.forEach(article -> {
                        System.out.println(article);
                    });
                    break;
                case 4:
                    //Get Article from user Input
                    Article article = getUserInput();
                    // Insert Article into DataBase
                    articleDAO.insert(article);
                    List<Author> authorList = article.getAuthors();
                    //loop authorlist
                    for (int i = 0; i < authorList.size(); i++) {
                        //single author
                        Author author = authorList.get(i);
                        //insert single author into database
                        authorDAO.insert(author);
                    }
                case 5:
                    //UserInput which takes Article name and Author name
                    System.out.println("Please insert Author FirstName");
                    String stringName = input.next();
                    List<Author> authorList1 = authorDAO.getByfirstName(stringName);
                    for (int i = 0; i < authorList1.size(); i++) {
                        Author author = authorList1.get(i);
                        int articleId = author.getArticleId();
                        Article article1 = articleDAO.getByID(articleId);
                        System.out.println(article1);
                    }
                    break;
                case 6:
                    //from Database all article into articleList
                    List<Article> articleList2 = articleDAO.getALL();
                    //write in JSON file(exported.JSON)
                    articleDAO.exportArticles(articleList2, "exported.JSON");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}

