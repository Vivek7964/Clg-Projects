public class Comics extends LibraryItem implements Borrowable, Returnable {
    private String genre;
    private boolean isBorrowed;

    public Comics(String id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
        this.isBorrowed = false;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Comics [ID: " + getId() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Genre: " + genre + ", Borrowed: " + isBorrowed + "]");
    }

    @Override
    public void borrowItem(String userId) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Comics borrowed by user: " + userId);
        } else {
            System.out.println("Comics is already borrowed.");
        }
    }

    @Override
    public void returnItem(String userId) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Comics returned by user: " + userId);
        } else {
            System.out.println("Comics was not borrowed.");
        }
    }
}
