/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.task18withjdbc.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Article {
    private int articleId;
    private String title;
    private String publishedDate;
    private List<Author> authors = new ArrayList<Author>();

    public Article() {
    }

    public Article(int articleId, String title, String publishedDate, List<Author> authors) {
        this.articleId = articleId;
        this.title = title;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", authors=" + authors +
                '}';
    }
}
