import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
        System.out.println("Item with ID " + id + " removed.");
    }

    public void viewItems() {
        System.out.println("Library Items:");
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public LibraryItem findItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
