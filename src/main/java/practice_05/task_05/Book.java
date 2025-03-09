package practice_05.task_05;

public class Book {

    private String author;
    private String nameBook;
    private CardBook cardBook;

    Book(String author, String nameBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.cardBook = new CardBook();
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setAvalable(boolean avalable) {
        cardBook.setAvalable(avalable);
    }

    boolean getIsAvalable() {
        return cardBook.getIsAvalable();
    }

    String bookInfo() {
        return getNameBook() + ", автор " + getAuthor();
    }

    public CardBook getCardBook() {
        return this.cardBook;
    }
}
