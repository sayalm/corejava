/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.program.sayal.task18withjdbc.dao;

import com.mycompany.program.sayal.task18withjdbc.entity.Article;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface ArticleDAO{
    void exportArticles(List<Article> articleList, String FILENAME) throws ClassNotFoundException, SQLException;
    List<Article> importArticles(String FILEURL);
    List<Article> getALL() throws ClassNotFoundException,SQLException;
    int insert(Article A) throws ClassNotFoundException,SQLException;
    Article getByID(int id) throws ClassNotFoundException, SQLException;
    Article DeleteById(int id) throws SQLException, ClassNotFoundException;
}
