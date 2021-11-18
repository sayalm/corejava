package Task18;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String title;
    private String publishedDate;
    private List<Author> authors = new ArrayList<Author>();

    public Article(String title, String publishedDate, List<Author> authors) {
        this.title = title;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

    public Article() {

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
                "title='" + title + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", authors=" + authors +
                '}';
    }
}
