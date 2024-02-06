package com.java.collections;

import java.util.*;
import java.util.function.Consumer;

public class ListIterations {

    public static void main(String[] args){
        //List<?> marks= Arrays.asList(90,"Shravan","Shreya",93,94,95,96);// to initialize hetrogenous data.
        List<Integer> marks= Arrays.asList(90,91,92,93,94,95,96);// to initialize a list we use Arrays.asList().
        System.out.println(marks);

        iterate1(marks);
        iterate2(marks);
        iterate3(marks);
        iterate4(marks);
        iterate5(marks);
        iterate6(marks);

    }


    private static void iterate1(List<Integer> marks) {
        System.out.println(">>> Iteration using a for loop and get() method- only for List implementations");
        for(int i=0;i<marks.size();i++){
            Integer n= marks.get(i);
            System.out.print(n+"  ");
        }
        System.out.println("\n");
    }
    private static void iterate2(List<Integer> marks) {
        System.out.println(">>> Iteration using a enhanced for loop");
        for(Integer n:marks){
            System.out.print(n+"  ");
        }
        System.out.println("\n");
    }

    private static void iterate3(List<Integer> marks) {
        System.out.println(">>> Iteration using a java.util.Iterator");
        Iterator<Integer> it= marks.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            System.out.print(n+"    ");
        }
        System.out.println("\n");
    }

    private static void iterate4(List<Integer> marks) {
        System.out.println(">>> Iteration using a java.util.ListIterator - only for List implementation");
        ListIterator<Integer> it= marks.listIterator();
        while(it.hasNext()){
            Integer n=it.next();
            System.out.print(n+"    ");
        }
        System.out.println("\n");
        //In list iterator we can iterate list in reverse order
        while(it.hasPrevious()){
            Integer n=it.previous();
            System.out.print(n+"    ");
        }
        System.out.println("\n");
    }

    private static void iterate5(List<Integer> marks) {
        System.out.println(">>> Iteration using a java.util.Enumeration");
        Enumeration<Integer> it= Collections.enumeration(marks);
        while(it.hasMoreElements()){
            Integer n=it.nextElement();
            System.out.print(n+"    ");
        }
        System.out.println("\n");

    }

    private static void iterate6(List<Integer> marks) {
        System.out.println(">>> Iteration using forEach(java.util.function.Consumer) method");
        // this one new approach from java 8 onwards to iterate using consumer interface
        marks.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.print(t+"  ");
            }
        });
        System.out.println("\n");

        //using lambda( lambda is a way of representing an anonymous method which means no modifier, no return type & no method name)
        marks.forEach((Integer it) -> System.out.print(it+"   "));
        System.out.println("\n");

    }



}
