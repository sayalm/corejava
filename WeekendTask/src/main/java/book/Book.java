package book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String Title;
    private String PublicationName;
    private List<Author> authors = new ArrayList<Author>();

    public Book(String title, String publicationName, List<Author> authors) {
        Title = title;
        PublicationName = publicationName;
        this.authors = authors;
    }

    public Book() {

    }

    public static void setAuthor(List<Author> authorList) {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublicationName() {
        return PublicationName;
    }

    public void setPublicationName(String publicationName) {
        PublicationName = publicationName;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", PublicationName='" + PublicationName + '\'' +
                ", authors=" + authors +
                '}';
    }
}
