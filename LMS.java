public class LMS {
        public static void main(String[] args) {
            Library library = new Library();

            // Add books
            library.addBook("B001", "The Great Gatsby");
            library.addBook("B002", "1984");
            library.addBook("B003", "To Kill a Mockingbird");

            // Register patrons
            library.registerPatron("P001", "Alice");
            library.registerPatron("P002", "Bob");

            // Borrow books
            library.borrowBook("P001", "B001");
            library.borrowBook("P002", "B002");

            // Display books
            library.displayBooks();

            // Return books
            library.returnBook("P001", "B001");
            library.returnBook("P002", "B002");

            // Display books again
            library.displayBooks();}
    }
