package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMethods {

    public static void main(String[] args){
        List<String> names= new ArrayList<String>();
        System.out.println("No. of entries: "+ names.size());//.size() is to get the size of the list
        System.out.println("Is name empty: "+names.isEmpty());//.isEmpty() is to check if the list is empty or not which returns True or False.
        System.out.println(names);

        names.add("Shravan");
        names.add("Reddy");
        names.add("Kandakatla");
        names.add("Shravan");
        names.add("Reddy");
        names.add("Kandakatla");
        names.add("Shravan");// Duplicate values are allowed in List and it will maintain the order.
        names.add("Reddy");
        names.add("Kandakatla");
        System.out.println(names+" | size: "+ names.size());

        names.add(1,"Shreya");// to add element in between 1 is index where you want to add and Shreya is the element I want to add.
        System.out.println(names+" | size: "+ names.size());

        System.out.println("Index of Kandakatla is: "+names.indexOf("Kandakatla"));// it will return the first index of Kandakatla.
        System.out.println("Index of Kandakatla is: "+names.lastIndexOf("Kandakatla"));// it will return the last index of Kandakatla.

        System.out.println("Index of Kan is: "+names.lastIndexOf("kan"));// if the element is not present it will return -1

        System.out.println("to get the name at give index: "+names.get(1) );// to get the value based on index

        System.out.println(names.remove("Shravan"));// this will true
        System.out.println(names.remove(0));// this will remove the element and return the element removed.

        System.out.println(names+" | size: "+ names.size());

        System.out.println("is Shravan present in the list: "+names.contains("Shravan"));//it wil return true or false

        Integer occurrences= Collections.frequency(names, "Shravan");// to get the count of specific element in the List.
        System.out.println("Count of Reddy in the List: "+occurrences);


    }
}
