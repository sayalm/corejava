package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static final String BOOK_JSON = "files/book.json";
    public static final String BOOK_1_JSON = "files/book1.json";

    public static void main(String[] args) {
        Book book1 = new Book();

        List<Author> authorList = new ArrayList<Author>();
        authorList.add(new Author("Michael Anthony","Holding","USA","sakdjajd@gmail.com"));
        authorList.add(new Author("Sudha","Murty","INDIA", "as3wqe@gmail.com"));
        Book.setAuthor(authorList);

        List<Book> BookList = new ArrayList<Book>();
        List<Author> authorList1 = new ArrayList<Author>();
        authorList1.add(new Author("Apoorva","Kumar Singh","INDIA","asdda@gmail.com"));
        Book book = new Book("A Commentary and Digest on The Air, Act 1981","Law House", authorList1);
        BookList.add(book1);
        BookList.add(book);

        AuthorUtils export1 = new AuthorUtils();
        export1.exportAuthors(authorList, BOOK_JSON);
        export1.importAuthors(BOOK_JSON);
        AuthorUtils.printMessage();

        Iterator<Author> it =  book.getAuthors().iterator();
        int index = -1;
        while (it.hasNext()){
            Author author = it.next();
            String str = (author.toString());
            System.out.println(author.toString());
            boolean result = author.getFirstName().equalsIgnoreCase("Sudha");
            if (result){
                index = book.getAuthors().indexOf(author);
            }

            System.out.println(book.getAuthors());
            BookUtils bookUtils = new BookUtils();
            bookUtils.exportBook(BookList, BOOK_1_JSON);
            bookUtils.importBook(BOOK_1_JSON);
            bookUtils.printMessage1();
        }




    }
}
