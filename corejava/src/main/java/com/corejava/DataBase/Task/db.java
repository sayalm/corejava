package com.corejava.DataBase.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db extends javax.swing.JFrame{
    private JTextField textField1;
    private JPanel panel1;
    private JButton insertPleaseButton;
    private Label input;

    Connection con;
    public db() {
        initComponents();
        createConnection();
        insertPleaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void initComponents() {
    }


    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Author","root","admin");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }


    @SuppressWarnings("unchecked")

    private void jButton1ActionPerformed(java.awt.event.ActionEvent  evt) throws SQLException {
        String name = input.getText();
        Statement stmt = con.createStatement();
//        String drop = "INSERT INTO AUTHORS VALUES('""')";


    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new db().setVisible(true);
            }
        });
    }
}
