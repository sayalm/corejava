package com.corejava.Interfaces.Task2;

import com.corejava.Object.Author;

import java.util.List;

public interface IAuthor {
    //To write Author list in File.
    void exportAuthors(List<Author> authorList, String fileName);

    //To read Author list from file.
    List<Author> importAuthors(String fileName);

}
