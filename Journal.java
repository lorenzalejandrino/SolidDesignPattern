public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the journal: " + title);
    }
}