package com.java.collections;

public class Book {
    private Integer bookId;
    private String bookTile;

    public Book(Integer bookId, String bookTile) {
        this.bookId = bookId;
        this.bookTile = bookTile;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTile() {
        return bookTile;
    }

    public void setBookTile(String bookTile) {
        this.bookTile = bookTile;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTile='" + bookTile + '\'' +
                '}';
    }
}
