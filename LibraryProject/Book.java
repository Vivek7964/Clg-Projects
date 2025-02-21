public class Book extends LibraryItem implements Borrowable, Returnable {
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        super(id, title, author);
        this.isBorrowed = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book [ID: " + getId() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Borrowed: " + isBorrowed + "]");
    }

    @Override
    public void borrowItem(String userId) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed by user: " + userId);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem(String userId) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned by user: " + userId);
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
