/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.task18withjdbc.dao;

import com.mycompany.program.sayal.task18withjdbc.entity.Author;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface AuthorDAO{
     void exportAuthors(List<Author> authorList, String FILEURL);
    List<Author> importAuthors(String FILEURL);
    List<Author> getAll()throws ClassNotFoundException, SQLException;
    int insert(Author At) throws ClassNotFoundException, SQLException;
    Author getById(int id) throws ClassNotFoundException, SQLException;
    Author DeleteById(int id) throws SQLException, ClassNotFoundException;
    List<Author> getByArticleId(int id) throws ClassNotFoundException,SQLException;
    List<Author> getByfirstName(String firstname) throws SQLException, ClassNotFoundException;
}
