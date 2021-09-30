package com.corejava.CollectionFramework.Task;

public class Steps {
    public static void main(String[] args) {
  String test = "99000001\t$Actions";
        System.out.println(test);
        String term = test.split("\t")[1];
        System.out.println(term);
        String pluralTerm = "";
        String singularTerm = "";
        // Check if plural or singular
        // Checking if term ends with s - if true its plural term
        if(term.endsWith("s")){
            System.out.println("Plural Term detected: " + term);
            pluralTerm = term;
            singularTerm = pluralTerm.substring(0, term.length()-1);
            System.out.println(pluralTerm);
            System.out.println(singularTerm);
        }

        String test1 = "99000001\t$Hobbies";
        System.out.println(test1);
        String term1 = test1.split("\t")[1];
        System.out.println(term1);
        String pluralTerm1 = "";
        String singularTerm1 = "";
        if(term1.endsWith("es")){
            System.out.println("Plural Term detected: " + term1);
            pluralTerm1 = term1;
            singularTerm1 = pluralTerm1.substring(0, term1.length()-3).concat("y");
            System.out.println(pluralTerm1);
            System.out.println(singularTerm1);
            System.out.println(singularTerm.replaceFirst("$","What"));
        }


    }
}
