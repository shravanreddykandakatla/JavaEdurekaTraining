package com.java.collections;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
//o1 will be initialized to the first object entry and o2 will be next objects entries it will compare to.
    @Override
    public int compare(Book o1, Book o2) {
        //if it returns 0 then the element won't be added if it returns positive value it will place after the initial element and if it returns negative it will be placed before the initial element.
        return o1.getBookId()-o2.getBookId();
    }
}
