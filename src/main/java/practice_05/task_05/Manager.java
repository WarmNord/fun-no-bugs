package practice_05.task_05;

public class Manager {
    private Library library = new Library();


    void addBook(Book book) {
        library.addBook(book);
    }

    void addUser(User user) {
        library.addUser(user);
    }

    void giveBook(User user, Book book) {
        library.takeBook(user, book);
    }

    void returnBook(User user, Book book) {
        library.returnBook(user, book);
    }


    public static void main(String[] args) {
        Manager manager = new Manager();

        User u1 = new User("Алёна");
        User u2 = new User("Андрей");
        Book b1 = new Book("А.С. Пушкин", "Евгений Онегин");
        Book b2 = new Book("М. Булгаков", "Мастер и Маргарита");

        manager.addBook(b1);
        manager.addBook(b2);
        manager.addUser(u1);
        manager.addUser(u2);

        manager.giveBook(u2, b2);
        manager.giveBook(u1, b2);

        manager.returnBook(u2,b2);
        manager.returnBook(u2,b2);
    }
}
