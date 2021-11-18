package com.mycompany.program.sayal.task18withjdbc.dao.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.program.sayal.task18withjdbc.constant.SQLConstant;
import com.mycompany.program.sayal.task18withjdbc.dao.ArticleDAO;
import com.mycompany.program.sayal.task18withjdbc.dbconnection.DbConnection;
import com.mycompany.program.sayal.task18withjdbc.entity.Article;
import com.mycompany.program.sayal.task18withjdbc.entity.Author;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author User
 */
public class ArticleDAOImpl implements ArticleDAO {

    private DbConnection conn = new DbConnection();


    @Override
    public void exportArticles(List<Article> articleList, String FILENAME) throws ClassNotFoundException, SQLException {
        //file write
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = Files.newBufferedWriter(Paths.get(FILENAME))) {//write into json file
            gson.toJson(articleList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Article> importArticles(String FILEURL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Article> getALL() throws ClassNotFoundException, SQLException {
        List<Article> articleList = new ArrayList<>();
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.ARTICLE_GETALL);
        ResultSet rs = conn.executeQuery();

        while (rs.next()) {
            articleList.add(mapData(rs));
        }
        conn.close();
        return articleList;
    }

    @Override
    public int insert(Article A) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO articles(article_id,article_title,article_publishedDate) VALUES(?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setInt(1, A.getArticleId());
        stmt.setString(2, A.getTitle());
        stmt.setString(3, A.getPublishedDate());
        int result = conn.executeUpdate();
        conn.close();
        return result;
    }

    @Override
    public Article getByID(int id) throws ClassNotFoundException, SQLException {
        Article article = null;
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.ARTICLE_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            article = mapData(rs);
        }
        conn.close();
        return article;

    }


    @Override
    public Article DeleteById(int id) throws SQLException, ClassNotFoundException {
        conn.open();
        PreparedStatement stmt = conn.initStatement(SQLConstant.ARTICLE_DELETEBYID);
        stmt.executeUpdate();
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("article_id"));
            System.out.print(", Title: " + rs.getInt("article_title"));
            System.out.print(", PublishedDate: " + rs.getString("article_publishedDate"));

        }
        conn.close();
        return null;
    }

    private Article mapData(ResultSet rs) throws SQLException, ClassNotFoundException {
        Article a = new Article();
        a.setArticleId(rs.getInt("article_id"));
        a.setTitle(rs.getString("article_title"));
        a.setPublishedDate(rs.getString("article_publishedDate"));
        //set Authors from different query
        AuthorDAOImpl authorDAO = new AuthorDAOImpl();
        a.setAuthors(authorDAO.getByArticleId(a.getArticleId()));
        return a;
    }
}
