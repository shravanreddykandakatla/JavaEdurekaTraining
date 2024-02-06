package com.java.collections;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

       hashSetTest();
       linkedHashSet();
       treeSetTest();

       //treeSet using custom comparator
        treeSetTest2();

    }

    private static void treeSetTest2() {
        //in a treeSet we cannot add null objects or references, but we can in HashSet and LinkedHashSet
        Set<Book> books=new TreeSet<Book>(new BookComparator());
        Book b1=new Book(123,"Java");
        Book b2=new Book(456,"Spring");
        Book b3=new Book(789,"Angular");
        Book b4=new Book(279,"Node");
        Book b5=new Book(109,"React");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Iterator<Book> it= books.iterator();
        while (it.hasNext()){
            Book bk=it.next();
            System.out.println(bk);
        }



    }

    private static void treeSetTest() {
        //TreeSet is used to remove the duplicates and store elements in ascending order.
        Set<String> names= new TreeSet<String>();
        names.add("Shravan");//this adds method returns boolean
        names.add("Shravan");// it will return false since it will not add duplicate values, and it is case-sensitive.
        names.add("Shreya");
        names.add("Shra1");
        names.add("Reddy");
        names.add("Kandakatla");
        System.out.println(names.size());
        System.out.println(names);
    }

    private static void linkedHashSet() {
        //LinkedHashSet is used to remove the duplicates and maintains the order.
        Set<String> names= new LinkedHashSet<String>();
        names.add("Shravan");//this adds method returns boolean
        names.add("Shravan");// it will return false since it will not add duplicate values, and it is case-sensitive.
        names.add("Shreya");
        names.add("Shra1");
        names.add("Reddy");
        names.add("Kandakatla");
        System.out.println(names.size());
        System.out.println(names);
    }

    private static void hashSetTest() {
        //HashSet is used to remove the duplicates and give better performance over treeSet but doesn't maintain the order in which they're added.
        Set<String> names= new HashSet<String>();
        System.out.print(names.add("Shravan")+"   ");//this adds method returns boolean
        System.out.print(names.add("Shravan")+"   ");// it will return false since it will not add duplicate values, and it is case-sensitive.
        System.out.print(names.add("Shreya")+"   ");
        System.out.print(names.add("Shra1")+"   ");
        System.out.print(names.add("Reddy")+"   ");
        System.out.print(names.add("Kandakatla")+"\n");
        System.out.println("Size of the set: "+names.size());
        System.out.println(names);
    }

}
