package com.sayal.masterclass.operators;

public class newOperaters {
    public static void main(String [] args) {
        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the high score");


        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");
        if((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // 1. create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operater to figure out the remainder from the sum of
        //#3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        // If the remaining total (#4) is equal to 20 or less.

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " +theRemainder);
        if(theRemainder <=20)
            System.out.println("Total was over the limit");
    }

    }
