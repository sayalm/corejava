package com.corejava.Object;

import com.corejava.Interfaces.Task2.AuthorUtils;

import java.io.IOException;
import java.util.*;

public class Main {

//    public static final String FILE_NAME = "D:\\sayal\\corejava\\corejava\\files\\New1.json";
public static final String FILE_NAME = "files/New2.json";
    public static final String ARTICLEFILENAME = "files/Article.json";

    public static void main(String[] args) throws IOException {
        Article article = new Article();
        article.setPublicationDate(new Date());
        System.out.println(article.toString());

        Author author1 = new Author("say1", "maney", "bkt", "sdrreead@gmail.com", "917564583982");
        article.addAuthor(author1);

        List<Author> authorList = new ArrayList<Author>();
        authorList.add(new Author("say1", "maney", "bkt", "sdrreead@gmail.com", "917564583982"));
        authorList.add(new Author("aay2", "mants", "pkr", "sdammmmmd@gmail.com", "91701210172"));
        authorList.add(new Author("bay3", "maniya", "ktm", "sdaasaaad@gmail.com", "917568872"));
        authorList.add(new Author("cay4", "baniya", "btl", "sxvxcdad@gmail.com", "917954239872"));
        authorList.add(new Author("vay5", "umaniya", "ctw", "xcvxvc@gmail.com", "9177865872"));
        authorList.add(new Author("iay6", "man", "bnp", "thtcvb@gmail.com", "917783123872"));
        System.out.println("listed Author list" + authorList);
        article.setAuthors(authorList);

        List<Article> articleList = new ArrayList<Article>();
        List<Author> authorList1 = new ArrayList<Author>();
        authorList1.add(new Author("hari", "maney", "bkt", "sdrreead@gmail.com", "917564583982"));
        authorList1.add(new Author("aay2", "mants", "pkr", "sdammmmmd@gmail.com", "91701210172"));
        Article article1 = new Article("abcd",new Date(),authorList1);
        articleList.add(article);
        articleList.add(article1);

        ArticleUtils export1 = new ArticleUtils();
        export1.exportArticles(articleList, ARTICLEFILENAME);
        export1.importArticles(ARTICLEFILENAME);
        ArticleUtils.printMessage1();







        Iterator<Author> it = article.getAuthors().iterator(); //authorList.iterator();
        int index = -1; // index null upto this step

        while (it.hasNext()) {

            Author author = it.next();
            String str = (author.toString());// return value to the given format.returned string object
            System.out.println(author.toString());

            boolean result = author.getFirstName().equalsIgnoreCase("aay2");

            if (result) {
                index = article.getAuthors().indexOf(author);
            }
        }

        //Delete here
        if (index >= 0) {
            article.getAuthors().remove(index);
            System.out.println("Deleted Author");
            System.out.println(authorList);
        }

        Collections.sort(article.getAuthors(), new Comparator<Author>() {
            @Override
            public int compare(Author u1, Author u2) {

                return u1.getFirstName().compareTo(u2.getFirstName());
            }
        });

        System.out.println(article.getAuthors());
        AuthorUtils authorUtils = new AuthorUtils();
        authorUtils.exportAuthors(authorList, FILE_NAME);
        authorUtils.importAuthors(FILE_NAME);
        AuthorUtils.printMessage();

    }
}
