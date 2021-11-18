package Task18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AuthorUtils implements IAuthor{


    @Override
    public void exportAuthors(List<Author> authorList, String FILEURL) {
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        try(Writer writer = Files.newBufferedWriter(Paths.get(FILEURL))) {
            gson1.toJson(authorList, writer);

       }catch (IOException e) {
           e.printStackTrace();     }
    }

    @Override
    public List<Author> importAuthors(String fileName) {
        return null;
    }
}
