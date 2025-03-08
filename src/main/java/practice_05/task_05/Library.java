package practice_05.task_05;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private int capacityBook = books.size();
    private List<User> users = new ArrayList<>();


    void addBook(Book book) {
        books.add(book);
    }

    void addUser(User user) {
        users.add(user);
    }

    void takeBook(User user, Book book) {
        if (book.getIsAvalable() == true) {
            capacityBook--;
            book.setAvalable(false);
            System.out.println("Пользователь " + user.getName() + " взял книгу " + book.bookInfo());
        } else {
            System.out.println("Книга " + book.bookInfo() + " не доступна к выдаче");
        }
    }

    void returnBook(User user, Book book) {
        if (book.getIsAvalable() == false) {
            capacityBook++;
            book.setAvalable(true);
            System.out.println("Пользователь " + user.getName() + " вернул книгу " + book.bookInfo());
        } else {
            System.out.println("Книгу " + book.bookInfo() + " нельзя вернуть");
        }
    }

    /*Библиотека
В библиотеке есть книги и читатели. Читатели могут брать книги из библиотеки и возвращать их. Нужно спроектировать систему, которая управляет списком доступных книг, уменьшает количество книг при их выдаче и увеличивает при их возврате. Также система должна фиксировать, какие читатели берут или возвращают книги.*/

    public static void main(String[] args) {
        Library library = new Library();
        User u1 = new User("Алёна");
        User u2 = new User("Андрей");
        Book b1 = new Book("А.С. Пушкин", "Евгений Онегин");
        Book b2 = new Book("М. Булгаков", "Мастер и Маргарита");

        library.addBook(b1);
        library.addBook(b2);
        library.addUser(u1);
        library.addUser(u2);

        library.takeBook(u2, b2);
        library.takeBook(u1, b2);

        library.returnBook(u2,b2);
        library.returnBook(u2,b2);
    }
}
