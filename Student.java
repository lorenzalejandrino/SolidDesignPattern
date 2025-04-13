public class Student {
    private String name;
    private LibrarySystem librarySystem;

    public Student(String name, LibrarySystem librarySystem) {
        this.name = name;
        this.librarySystem = librarySystem;
    }

    public void borrowResource(String title) {
        librarySystem.borrowResource(title, name);
    }
}