package com.corejava.Object;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Article {

    private String Title;
    private Date publicationDate;
    //private Author author;
    private List<Author> authors = new ArrayList<Author>();

    public Article(String title, Date publicationDate, List<Author> authors) {
        Title = title;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }

    public Article() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return "Article{" +
                "Title='" + Title + '\'' +
                ", publicationDate=" + publicationDate +
                ", authors=" + authors +
                '}';
    }

}


