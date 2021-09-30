package com.corejava.CollectionFramework.Task;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){ // match key element with array element
                return i; // If key element is found
            }
        }
        return -1;// IF key element not found
    }
    public static void main(String a[]){
        int[] a1= {15,16, 2, 30,100,2,56,47};
        int key = 1;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
    }
}

