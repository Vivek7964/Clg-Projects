import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding sample data
        library.addItem(new Book("B1", "Java Programming", "John Doe"));
        library.addItem(new Comics("C1", "Spider-Man", "Stan Lee", "Superhero"));

        int choice;
        do {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. View Items");
            System.out.println("2. Borrow Item");
            System.out.println("3. Return Item");
            System.out.println("4. Add Item");
            System.out.println("5. Remove Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.viewItems();
                    break;
                case 2:
                    System.out.print("Enter item ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    LibraryItem borrowItem = library.findItem(borrowId);
                    if (borrowItem instanceof Borrowable) {
                        ((Borrowable) borrowItem).borrowItem("User1");
                    } else {
                        System.out.println("Item cannot be borrowed.");
                    }
                    break;
                case 3:
                    System.out.print("Enter item ID to return: ");
                    String returnId = scanner.nextLine();
                    LibraryItem returnItem = library.findItem(returnId);
                    if (returnItem instanceof Returnable) {
                        ((Returnable) returnItem).returnItem("User1");
                    } else {
                        System.out.println("Item cannot be returned.");
                    }
                    break;
                case 4:
                    System.out.print("Enter type (Book/Comics): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    if (type.equalsIgnoreCase("Book")) {
                        library.addItem(new Book(id, title, author));
                    } else if (type.equalsIgnoreCase("Comics")) {
                        System.out.print("Enter Genre: ");
                        String genre = scanner.nextLine();
                        library.addItem(new Comics(id, title, author, genre));
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;
                case 5:
                    System.out.print("Enter item ID to remove: ");
                    String removeId = scanner.nextLine();
                    library.removeItem(removeId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
 