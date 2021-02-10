package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager  {
    public static List<Book> bookDirectory = new ArrayList<>();



    public static  Book createBook(String title, String author) {

       Book  newBook = new Book(title,author);

       if (bookDirectory.contains(newBook)) {
           return newBook;


       }
       else {
           bookDirectory.add(newBook);
           return newBook;
       }







    }
}
