public class Book {

    private final String bookName;
    private final String bookAuthor;
    private final int bookPages;
    private final int bookISBN;

    public Book(String bookName, String bookAuthor, int bookPages, int bookISBN) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookISBN = bookISBN;
    }
}
