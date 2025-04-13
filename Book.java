public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the book: " + title);
    }
}