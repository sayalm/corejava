package com.corejava.CollectionFramework.Task;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();//Array list is created with name list
        list.add("Nepal"); //multiple string is added into the list
        list.add("India");
        list.add("Pakistan");
        list.add("America");
        list.add("Bhutan");

        /*for (String element : list){// element is String variable name which takes data from List name list
            if (element.contains("India")){ //contains result and checks if the element is in list or not
                System.out.println(element);// prints the string variable
                list.remove("India");
                System.out.println(list);
            }
        }*/
        Object result = list.contains("Nepal");
        System.out.println(result);
        list.remove("India");
        System.out.println(list);


    }
}
