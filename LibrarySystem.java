import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    private Map<String, LibraryResource> resources = new HashMap<>();

    public void addResource(LibraryResource resource) {
        resources.put(resource.getTitle(), resource);
    }

    public void borrowResource(String title, String borrowerName) {
        if (resources.containsKey(title)) {
            resources.get(title).borrow(borrowerName);
        } else {
            System.out.println("Resource not found: " + title);
        }
    }
}