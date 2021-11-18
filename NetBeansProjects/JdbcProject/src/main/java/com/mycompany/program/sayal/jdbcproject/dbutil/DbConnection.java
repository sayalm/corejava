/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.jdbcproject.dbutil;

import com.mycompany.program.sayal.jdbcproject.constant.DbConstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DbConnection {
    private Connection conn =null;
    private PreparedStatement stmt=null;
    
    public void open() throws ClassNotFoundException, SQLException{
        Class.forName(DbConstant.DB_DRIVER);
         conn = DriverManager.getConnection(DbConstant.DB_URL, DbConstant.DB_USERNAME, DbConstant.DB_PASSWORD );
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException{
        stmt = conn.prepareStatement(sql);
        return stmt;
    }
    public int executeUpdate() throws SQLException{
        return stmt.executeUpdate();
    }
    public ResultSet executeQuery() throws SQLException{
        return stmt.executeQuery();
    }
    
    public void close() throws SQLException{
        if(conn!=null && !conn.isClosed()){
        conn.close();
        conn=null;
        }
    }
}
