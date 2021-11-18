package Task18;

import java.util.List;

public interface IAuthor {
    void exportAuthors(List<Author> authorList, String FILEURL);
    List<Author> importAuthors(String FILEURL);
}
