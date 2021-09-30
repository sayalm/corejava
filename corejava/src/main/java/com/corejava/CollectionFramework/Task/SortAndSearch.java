

package com.corejava.CollectionFramework.Task;

import java.util.ArrayList;
import java.util.List;

public class SortAndSearch {
    public static void main(String[] args) {
        int temp;
        // Unsorted Array
        List<Integer> list = new ArrayList<>();
        //{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        list.add(10);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);


        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j) < list.get(j - 1)) {
                    temp = (Integer) list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " \n ");
        }

        int indexValue = list.indexOf(9);
        Integer searchNum = list.get(indexValue);
        boolean listHasElement = list.contains(8);

        System.out.println(8>=0);
        if( 10 < 20 ) {
            System.out.println("This is if statement");
        }
        if( true ) {
            System.out.println("This is if statement");
        }
        if( false ) {
            System.out.println("This is false");
        }
        if( !true ) {
            System.out.println("This is not true");
        }
        if(listHasElement){
            System.out.println("list Has Element");
        }
        if(!listHasElement){
            System.out.println("list Doesn't Have Element");
        }



    }




        // Sorting the array
//     Collections.sort(list);

        // Printing sorted array
       /* System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/

        // Using binarySearch to search for desired element
      /*  int index = Arrays.binarySearch(list,0);

        // Printing result
        if (index >= 0)
            System.out.println("Element 2 found at index: "
                    + index);
        else
            System.out.println("Element not found");
    }
}*/
    }

