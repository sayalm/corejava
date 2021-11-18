package com.mycompany.program.sayal.task18withjdbc.fileUtils;

import com.mycompany.program.sayal.task18withjdbc.entity.Article;
import com.mycompany.program.sayal.task18withjdbc.entity.Author;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonReadFile {
    public static final String FILENAME = "D:/sayal/corejava/NetBeansProjects/Files/ArticlesJSON.json";
    public static List<Article> readJsonFile(){
        List<Article> articleList= new ArrayList<>();
        try{
            //read filename

            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(new FileReader(FILENAME));
            //store content in string--String contentString =
            JSONObject jsonObject = (JSONObject) object;
            JSONArray jsonArticleArray = (JSONArray) jsonObject.get("Article");
            Iterator articleIterator = jsonArticleArray.iterator();
            while(articleIterator.hasNext()){
                Object articleObject = articleIterator.next();
               JSONObject articleJsonObject = (JSONObject) articleObject;
                Article article = new Article();
                String title = (String) articleJsonObject.get("title");
                article.setTitle(title);
                System.out.println(title);
                String publishedDate = (String) articleJsonObject.get("publishedDate");
                article.setPublishedDate(publishedDate);
                System.out.println(publishedDate);
                JSONArray jsonAuthorArray = (JSONArray) articleJsonObject.get("authors");
                List<Author> authorList = new ArrayList<>();
                Iterator authorIterator = jsonAuthorArray.iterator();
                    while (authorIterator.hasNext()){
                        Object authorObject = authorIterator.next();
                        JSONObject authorJsonObject = (JSONObject) authorObject;
                        Author author = new Author();
                        String firstName = (String) authorJsonObject.get("firstName");
                        author.setFirstName(firstName);
                        String lastName = (String) authorJsonObject.get("lastName");
                        author.setLastName(lastName);
                        String address = (String) authorJsonObject.get("address");
                        author.setAddress(address);
                        String contact = (String) authorJsonObject.get("contact");
                        author.setContact(contact);
                        String email = (String) authorJsonObject.get("email");
                        author.setEmail(email);
                        System.out.println(firstName);
                        System.out.println(lastName);
                        System.out.println(address);
                        System.out.println(contact);
                        System.out.println(email);
                        authorList.add(author);
                    }
                    article.setAuthors(authorList);
                    articleList.add(article);
            }

        }catch(IOException | ParseException e) {
            e.printStackTrace();
        }
        return articleList;
    }
    public static void main(String[] args) {
        readJsonFile();

}
}
