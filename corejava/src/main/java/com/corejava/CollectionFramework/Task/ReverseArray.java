package com.corejava.CollectionFramework.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        // int Array
        Integer[] intArray = new Integer[]{15, 9, 16, 2, 30, 100, 2, 56, 47};

        // Sorting int Array in descending order
        Arrays.sort(intArray, Collections.reverseOrder());

        // Displaying elements of int Array
        System.out.println("Int Array Elements in reverse order:");
        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);

    }
}
