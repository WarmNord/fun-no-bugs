package practice_02;

public class Book {
/*    Поля:
    String title (название книги),
    String author (автор).
    Реализуйте:
    Конструктор для задания названия и автора.
    Геттеры и сеттеры для обоих полей.
    Метод printInfo(), который выводит:
            "Название: Гарри Поттер, Автор: Джоан Роулинг".
    В методе main создайте объект книги, измените автора через сеттер и выведите информацию.*/

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void printInfo(){
        System.out.println("Название: "+ getTitle() + ", Автор: " + getAuthor());
    }

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "Joan Rouling");
        book.printInfo();
        book.setAuthor("null");
        book.printInfo();
    }
}
