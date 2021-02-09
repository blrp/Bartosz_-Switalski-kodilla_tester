package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager.createBook("Pan Tadeusz","Adam Mickiewicz");
        BookManager.createBook("The Lord od the Rngs","J. R. R. Tolkien");


        System.out.println("------");
        System.out.println("Directory size:" + BookManager.bookDirectory.size());

        String book1 = "IS the same ? ";
        String book2 = "IS the same ? ";
        System.out.println(book1 == book2);
        System.out.println(book1.equals (book2));
        System.out.println("-----");




    }
}
