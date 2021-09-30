package com.corejava.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int i, sum = 0;
        int arr[] = new int[11];

        System.out.println("Enter 10 numbers");

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; ++i)
            arr[i] = sc.nextInt();
        if (arr[i] <= 5) {
            int pro = 1;
            for (i = 0; i < 5; ++i)
                pro = arr[i] * pro;

            System.out.println(" Products of numbers is:" + pro);
        }
    }
}
