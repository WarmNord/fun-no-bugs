package practice_05.task_05;

public class Book {

    private String author;
    private String nameBook;
    private boolean isAvalable;

    Book(String author, String nameBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.isAvalable = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setAvalable(boolean avalable) {
        this.isAvalable = avalable;
    }

    boolean getIsAvalable() {
        return this.isAvalable;
    }

    String bookInfo() {
        return getNameBook() + ", автор " + getAuthor();
    }
}
