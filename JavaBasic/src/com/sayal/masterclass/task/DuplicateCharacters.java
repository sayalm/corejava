package com.sayal.masterclass.task;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String string1 = "Great responsibilityr";
        int count;
        char[] string = string1.toCharArray();
        System.out.println("Duplicate characters in a given string: ");
        String testDone = "";
        for(int i = 0; i <string.length; i++) {
            // second r
            count = 1; // r already exists in string1 , so count of r = 1
            for(int j = i+1; j <string.length; j++) { // Comparing all the letters on the right of r
                if(testDone.contains(String.valueOf(string[i]))) {
                    break;
                }
                if(string[i] == string[j] && string[i] != ' ') {  // r == r && true
                    count++; //count of r = 2
                    //string[j] = '0';
                }
            }
            if(count > 1){
                testDone = testDone+string[i];
            }
            //We added this
            //System.out.println(string[i]+" : "+count);
            if(count > 1 && string[i] != '0') {
                System.out.println(string[i]+" : "+count);
               // System.out.println(string[i]);
            }

        }
    }
}
