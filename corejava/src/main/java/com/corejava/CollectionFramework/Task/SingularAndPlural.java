package com.corejava.CollectionFramework.Task;


import java.util.ArrayList;
/*import java.util.Iterator;*/
import java.util.Iterator;
import java.util.List;


public class SingularAndPlural {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("99000001\t$Actions");
        list.add("99000002\t$AdverseEffects");
        list.add("99000003\t$AlternativeModels");
        list.add("99000004\t$AminoAcids");
        list.add("99000005\t$AnimalModels");
        list.add("99000006\t$Antibodies");
        list.add("99000007\t$Bioprocesses");
        list.add("99000008\t$Biologics");
        list.add("99000009\t$Biomarkers");
        list.add("99000010\t$CellLine");
        list.add("99000012\t$CellTypes");
        list.add("99000013\t$ChemicalClasses");
        list.add("99000014\t$ProteinComplexes");
        list.add("99000015\t$Continents");
        list.add("99000016\t$Diseases");
        list.add("99000017\t$Elements");
        System.out.println("Listed Arraylist Elements");
        System.out.println("\t" + list);

        Iterator<String> it = list.iterator();


        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            /*System.out.println*//*(element.toString());*/
            String str = (element.toString());
            String term = str.split("\t")[1];
            /* System.out.println(term);*/
            String pluralTerm = "";
            String singularTerm = "";

            if (term.endsWith("ies")) { // Antibodies
                //System.out.println("Plural Term detected: " + term);
                pluralTerm = term;
                singularTerm = pluralTerm.substring(0, term.length() - 3).concat("y");
               /* System.out.println(pluralTerm1);
                System.out.println(singularTerm1);*/

            } else if (term.endsWith("es")) { // Cell Types and Chemical Classes and Bioprocesses
                //System.out.println("Plural Term detected: " + term);
                pluralTerm = term;
                if (term.endsWith("sses") || term.endsWith("xes")) {
                    singularTerm = pluralTerm.substring(0, term.length() - 2);
                } else
                    singularTerm = pluralTerm.substring(0, term.length() - 2).concat("e");
               /* System.out.println(pluralTerm2);
                System.out.println(singularTerm2);*/

            } else if (term.endsWith("s")) {
                //System.out.println("Plural Term detected: " + term);
                pluralTerm = term;
                singularTerm = pluralTerm.substring(0, term.length() - 1);
                /*System.out.println(pluralTerm);
                System.out.println(singularTerm);*/
            } else {
                //System.out.println("Singular Term detected: " + term);
                //System.out.println("Making Term Plural: " + term + "s");
                System.out.println(term.replaceFirst("\\$", "What ").replace("ne", "nes"));
                System.out.println(term.replaceFirst("\\$", "Which ").replace("ne", "nes"));
            }
            System.out.println(pluralTerm.replaceFirst("\\$", "What "));
            System.out.println(pluralTerm.replaceFirst("\\$", "Which "));
            System.out.println(singularTerm.replaceFirst("\\$", "What "));
            System.out.println(singularTerm.replaceFirst("\\$", "Which "));
        }
    }
}
