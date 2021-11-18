/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.task18withjdbc.dao.impl;

import com.mycompany.program.sayal.task18withjdbc.constant.SQLConstant;
import com.mycompany.program.sayal.task18withjdbc.dao.AuthorDAO;
import com.mycompany.program.sayal.task18withjdbc.dbconnection.DbConnection;
import com.mycompany.program.sayal.task18withjdbc.entity.Author;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AuthorDAOImpl implements AuthorDAO {
    private DbConnection conn = new DbConnection();
    
    @Override
    public void exportAuthors(List<Author> authorList, String FILENAME) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> importAuthors(String FILENAME) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAll() throws ClassNotFoundException, SQLException {
        List<Author> authorList =  new ArrayList<>();
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.AUTHOR_GETALL);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            authorList.add(mapData(rs));
        }
        conn.close();
        return authorList;
    }

    @Override
    public int insert(Author At) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO authors(author_id,firstName,lastName,address,email,contactNumber,article_id) VALUES(?,?,?,?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);

        stmt.setInt(1, At.getId());
        stmt.setString(2, At.getFirstName());
        stmt.setString(3, At.getLastName());
        stmt.setString(4, At.getAddress());
        stmt.setString(5, At.getEmail());
        stmt.setString(6, At.getContact());
        stmt.setInt(7, At.getArticleId());

        int result = conn.executeUpdate();
        conn.close();
        return result;
    }

    @Override
    public Author getById(int id) throws ClassNotFoundException, SQLException {
        Author at = null;
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.AUTHOR_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = conn.executeQuery();
        while(rs.next()) {
            at = mapData(rs);
        }
        conn.close();
        return at;
    }

    @Override
    public Author DeleteById(int id) throws SQLException, ClassNotFoundException {
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.AUTHOR_DELETEBYID);
        stmt.executeUpdate();
        ResultSet rs = conn.executeQuery();
        while(rs.next()) {
            System.out.print("ID: " + rs.getInt("author_id"));
            System.out.print(", FIRSTNAME: " + rs.getInt("firstName"));
            System.out.print(", LASTNAME: " + rs.getString("lastName"));
            System.out.println(", ADDRESS " + rs.getString("address"));
            System.out.println(", EMAIL " + rs.getString("email"));
            System.out.println(", CONTACTNUMBER " + rs.getString("contactNumber"));
            System.out.println(", ARTICLEID " + rs.getString("article_id"));
        }
        conn.close();
        return null;
    }

    @Override
    public List<Author> getByArticleId(int id) throws ClassNotFoundException, SQLException {
        List<Author> authorList = new ArrayList<>();
        conn.open();
        PreparedStatement statement = conn.initStatement(SQLConstant.AUTHOR_GETBYARTICLEID);
        statement.setInt(1, id);
        ResultSet resultSet = conn.executeQuery();
        while (resultSet.next()){
            authorList.add(mapData(resultSet));
        }
        conn.close();
        return authorList;
    }

    @Override
    public List<Author> getByfirstName(String firstname) throws SQLException, ClassNotFoundException {
        List<Author> authorList = new ArrayList<>();
        conn.open();
        PreparedStatement statement = conn.initStatement(SQLConstant.AUTHOR_GETBYFIRSTNAME);
        statement.setString(1,firstname);
        ResultSet resultSet = conn.executeQuery();
        while (resultSet.next()){
            authorList.add(mapData(resultSet));
        }

        return authorList;
    }

    private Author mapData(ResultSet rs) throws SQLException {
        Author at = new Author();
        at.setId(rs.getInt("author_id"));
        at.setFirstName(rs.getString("firstname"));
        at.setLastName(rs.getString("lastname"));
        at.setAddress(rs.getString("address"));
        at.setEmail(rs.getString("email"));
        at.setContact(rs.getString("contactNumber"));
        at.setArticleId(rs.getInt("article_Id"));
        return at;
    }
}
