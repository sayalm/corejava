/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.database1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args)  {
        main project = new main();
        project.createConnection();
    }
        void createConnection() {
                List<Author> authorList1 = new ArrayList<Author>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/author","root","admin");
            Statement stmt = con.createStatement();
//            String sql = "INSERT INTO AUTHORS(idAuthors,Authors_FirstName,Authors_LastName,Authors_Address,Authors_Email,Authors_ContactNumber)"
//                    + "VALUES(6,'hari','Bahadur','NEPAL','bahadur@gmail.com','9866646541')";
//                if(stmt.executeUpdate(sql)> 1){
//                    System.out.println("Record Added Successfully");
//                }  
                String sql = "SELECT * FROM authors";
               ResultSet rs = stmt.executeQuery(sql);
               
                
                
            while(rs.next()) {
                System.out.println(rs.getString("idAuthors"));
                String firstName = rs.getString("Authors_FirstName");
                String lastName = rs.getString("Authors_LastName");
                String address = rs.getString("Authors_Address");
                String email = rs.getString("Authors_Email");
                String contactNumber = rs.getString("Authors_ContactNumber");
                System.out.println(firstName);
                System.out.println(lastName);
                System.out.println(address);
                System.out.println(email);
                System.out.println(contactNumber);
                System.out.println("==================");
                Author author = new Author(firstName,lastName,address,email,contactNumber);
                authorList1.add(author);
   
               
           

            }
            System.out.println("Database connection success");
             con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE,null,ex);
        }
        finally{
            authorList1.stream().forEach(System.out::println);

        }
//        
//            
//               authorList1.add((Author) rs);
    }
    }
  
    

