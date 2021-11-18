package book;

import java.util.List;

public interface IBook {
    void exportBook(List<Book> bookList, String filename);

    List<Book> importBook(String fileName);

}
