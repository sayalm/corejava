package com.corejava.DataBase.Task;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Main project = new Main();
        project.createConnection();
    }

    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Author","root","admin");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM AUTHORS");
            while(rs.next()) {
                String name1 = rs.getString("Authors_FirstName");
                System.out.println(name1);
            }
            System.out.println("Database connection success");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }


}
