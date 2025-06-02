package practice_03;

public class TestLib {

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(library.getBookTitle());
        library.setBookTitle("ABC");
        System.out.println(library.getBookTitle());

        System.out.println( library.getAuthor());
        library.setAuthor("V");
        System.out.println( library.getAuthor());

        String author1 = library.author;
        System.out.println(author1);
        System.out.println(library.year);
        System.out.println(library.category);
    }
}
