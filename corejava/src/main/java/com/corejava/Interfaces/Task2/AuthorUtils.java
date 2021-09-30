package com.corejava.Interfaces.Task2;

import com.corejava.Object.Author;
import com.corejava.Object.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AuthorUtils implements IAuthor {
    String abc = "abc";
    static String xyz = "xyz";

    @Override
    public  void exportAuthors(List<Author> authorList, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = Files.newBufferedWriter(Paths.get(fileName))) {//write into json file
            gson.toJson(authorList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public  List<Author> importAuthors(String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader(fileName)) {
            // Convert JSON to JsonElement, and later to String
            JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);
            List<Author> authors = gson.fromJson(json, new TypeToken<List<Author>> () {}.getType());
            authors.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printMessage() {
        System.out.println("Calling static method.");
        System.out.println(Main.FILE_NAME);
    }

}
