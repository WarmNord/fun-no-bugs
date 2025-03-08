package practice_03;

public class Library {

  /*  Создайте класс Library с полями:
    private String bookTitle — название книги.
    protected String author — автор.
    Default поле int year — год издания.
    public String category — категория книги.

    Реализуйте геттеры и сеттеры для каждого поля.

    В другом классе создайте объект Libraryи проверьте доступ к полям в зависимости от модификаторов доступа.*/

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle() {
        return this.bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getCategory() {
        return this.category;
    }

    void setCategory(String category){
        this.category = category;
    }

    public static void main(String[] args) {
        Library library1 = new Library();
        String author1 = library1.bookTitle;

    }
}
