package com.sayal.masterclass.parsingvalue;

public class stringManipulation {
    public static void main(String[] args) {
        String sourceString = "Sayal120";
        System.out.println("Source String is " + sourceString);
        for (String Name : sourceString.split("y"))
            System.out.println("Name are  " + Name);


        String longString = "To see the complete code in action, click the Play button below.";
        String[] sar= longString.split("t" , 4);
        for (String Name : sar)
            System.out.println("Name are  " + Name);




    }
}
