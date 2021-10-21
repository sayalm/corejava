
package com.corejava.Regularexpression.Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //private static final String NAME_REGEX = ":*(.[A-Z][a-z]*.[A-Z][a-z]*.[A-z][a-z]*)";
    private static final String NAME_REGEX = "(?<=Developer Name: ).*";
    private static final String EMAIL_REGEX = "([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])";
    private static final String CONTACT_REGEX = "(?<=contact: ).*";
    private static File file;


    /*((+977)[ -])?(?(?<areacode>d{3}))?[ -]?(d{3})[ -]?(d{4})*/
    public static void main(String[] args) throws IOException {
        String newPath = "files/regex_read_file.txt";
        File file = new File(newPath);

        if (!file.exists()){
            System.err.println("File path not specified");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder builder = new StringBuilder();
        while((line = br.readLine())!=null){
            builder.append(line);
            builder.append("\n");
        }
        String content = builder.toString();
        Pattern namePattern = Pattern.compile(NAME_REGEX);
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

        Pattern contactPattern = Pattern.compile(CONTACT_REGEX);
        Matcher nameMatcher = namePattern.matcher(content);
        Matcher emailMatcher = emailPattern.matcher(content);
        Matcher contactMatcher = contactPattern.matcher(content);

        List<Developer> developerList = new ArrayList<>();

        while(nameMatcher.find()) {
            String matchedName = nameMatcher.group();
            String matchedEmail="";
            String matchedContact="";
            //System.out.println(matchedName.toString());
            if (emailMatcher.find()) {
                matchedEmail = emailMatcher.group();
                //System.out.println(matchedEmail.toString());
            }
            if (contactMatcher.find()) {
                matchedContact = contactMatcher.group();
                //System.out.println(matchedContact.toString());
            }
            Developer developer = new Developer(matchedName, matchedEmail, matchedContact);
            developerList.add(developer);
        }

        developerList.stream().forEach(System.out::println);
    }
}


