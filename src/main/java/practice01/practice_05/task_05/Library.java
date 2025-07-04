package practice01.practice_05.task_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private HashSet<CardBook> cardBooks = new HashSet<>();


    void addBook(Book book) {
        books.add(book);
        cardBooks.add(book.getCardBook());
    }

    void addUser(User user) {
        users.add(user);
    }

    void takeBook(User user, Book book) {
        if (book.getIsAvalable() == true) {
            book.setAvalable(false);
            book.getCardBook().setUser(user);
            System.out.println("Пользователь " + user.getName() + " взял книгу " + book.bookInfo());
        } else {
            System.out.println("Книга " + book.bookInfo() + " не доступна к выдаче");
        }
    }

    void returnBook(User user, Book book) {
        if (book.getIsAvalable() == false) {
            book.setAvalable(true);
            System.out.println("Пользователь " + user.getName() + " вернул книгу " + book.bookInfo());
        } else {
            System.out.println("Книгу " + book.bookInfo() + " нельзя вернуть");
        }
    }

    /*Библиотека
В библиотеке есть книги и читатели. Читатели могут брать книги из библиотеки и возвращать их.
Нужно спроектировать систему, которая управляет списком доступных книг, уменьшает количество книг при их выдаче и увеличивает при их возврате.
Также система должна фиксировать, какие читатели берут или возвращают книги.*/
}
