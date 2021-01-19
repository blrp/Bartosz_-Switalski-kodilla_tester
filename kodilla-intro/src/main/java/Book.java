public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        this.author = author;
        this.title = title;
        return Book;
    }
}
