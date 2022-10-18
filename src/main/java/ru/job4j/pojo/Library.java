package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book poetry = new Book("Poetry", 150);
        Book stories = new Book("Stories", 250);
        Book novel = new Book("Novel", 570);
        Book cleanCode = new Book("Clean code", 680);

        Book[] books = new Book[4];
        books[0] = poetry;
        books[1] = stories;
        books[2] = novel;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getNumberOfPages());
        }
        books[0] = cleanCode;
        books[3] = poetry;
        System.out.println("Swapped elements with indexes 0 and 3");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getNumberOfPages());
        }
        System.out.println("Show only books.name = Clean code");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getNumberOfPages());
            }
        }
    }
}