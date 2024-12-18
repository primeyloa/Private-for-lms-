import java.util.HashMap;

public class Library {
        private HashMap<String, Book> books;
        private HashMap<String, Patron> patrons;

        // Constructor
        public Library() {
            books = new HashMap<>();
            patrons = new HashMap<>();
        }

        // Add book
        public void addBook(String bookId, String title) {
            books.put(bookId, new Book(bookId, title));
            System.out.println("Book added: " + title);
        }

        // Register patron
        public void registerPatron(String patronId, String name) {
            patrons.put(patronId, new Patron(patronId, name));
            System.out.println("Patron registered: " + name);
        }

        // Borrow book
        public void borrowBook(String patronId, String bookId) {
            Patron patron = patrons.get(patronId);
            Book book = books.get(bookId);
            if (patron != null && book != null) {
                patron.borrowBook(book);
            } else {
                System.out.println("Invalid patron or book ID.");
            }
        }

        // Return book
        public void returnBook(String patronId, String bookId) {
            Patron patron = patrons.get(patronId);
            Book book = books.get(bookId);
            if (patron != null && book != null) {
                patron.returnBook(book);
            } else {
                System.out.println("Invalid patron or book ID.");
            }
        }

        // Display books
        public void displayBooks() {
            System.out.println("Books in the library:");
            for (Book book : books.values()) {
                System.out.println(book.getTitle() + " (ID: " + book.getBookId() + ") - " +
                        (book.isAvailable() ? "Available" : "Borrowed"));
            }
        }
}
