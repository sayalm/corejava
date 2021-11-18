package book;

import java.util.List;

public interface IAuthor {
    void exportAuthors(List<Author> authorList,String fileName);

    List<Author> importAuthors(String fileName);

}
