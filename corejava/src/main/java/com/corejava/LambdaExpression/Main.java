package com.corejava.LambdaExpression;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        //Lambda Expression for each used with -> arrows which takes number
        // then stored in variable n
        numbers.forEach( (n) -> {
            System.out.println(n);
        });
    }
}
