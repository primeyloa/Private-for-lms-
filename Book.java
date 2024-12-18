import java.util.HashMap;
// Book class
    public class Book {
        private String bookId;
        private String title;
        private boolean isAvailable;

        // Constructor
        public Book(String bookId, String title) {
            this.bookId = bookId;
            this.title = title;
            this.isAvailable = true;
        }

        // Getters
        public String getBookId() {
            return bookId;
        }

        public String getTitle() {
            return title;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        // Borrow book
        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
            } else {
                System.out.println("Book is already borrowed.");
            }
        }

        // Return book
        public void returnBook() {
            isAvailable = true;
        }
    }


