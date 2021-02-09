package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager  {
    public static List<Book> bookDirectory = new ArrayList<>();



    public static  Book createBook(String title, String author) {

       Book  newBook = new Book(title,author);
        bookDirectory.add(newBook);

        for (Book book : bookDirectory) {
            if (book.equals(newBook)) {
                System.out.println("Is in directory? :" + book.equals(newBook));
                bookDirectory.add(book);
                return book;
            }
            else System.out.println("Is in Directory ? :" + book.equals(newBook));


        }
        bookDirectory.add(newBook);
        return newBook;

    }
}
