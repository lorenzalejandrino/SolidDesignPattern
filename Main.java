public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();


        librarySystem.addResource(new Book("The Great Gatsby"));
        librarySystem.addResource(new Journal("Wuthering Heights"));
        librarySystem.addResource(new AudioBook("Moby-dick"));

        Student student = new Student("Ben", librarySystem);
        Student student2 = new Student("Anne", librarySystem);

        student.borrowResource("The Great Gatsby");
        student.borrowResource("Wuthering Heights");
        student2.borrowResource("Moby-dick");
        student.borrowResource("Non-Existent Resource");
    }
}