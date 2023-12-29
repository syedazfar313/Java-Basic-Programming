package Exercise32;

import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book '" + title + "' by " + author + " added to the library.");
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String status = book.available ? "Available" : "Checked Out";
            System.out.println((i + 1) + ". " + book.title + " by " + book.author + " - " + status);
        }
    }

    public void checkOutBook(int bookIndex) {
        if (isValidIndex(bookIndex)) {
            Book book = books.get(bookIndex - 1);
            if (book.available) {
                book.available = false;
                System.out.println("Checked out '" + book.title + "' by " + book.author + ".");
            } else {
                System.out.println("Sorry, '" + book.title + "' by " + book.author + " is already checked out.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void checkInBook(int bookIndex) {
        if (isValidIndex(bookIndex)) {
            Book book = books.get(bookIndex - 1);
            if (!book.available) {
                book.available = true;
                System.out.println("Checked in '" + book.title + "' by " + book.author + ".");
            } else {
                System.out.println(
                        "Error: '" + book.title + "' by " + book.author + " is already available in the library.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }

    private boolean isValidIndex(int bookIndex) {
        return bookIndex >= 1 && bookIndex <= books.size();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Check Out Book");
            System.out.println("4. Check In Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    library.displayBooks();
                    System.out.print("Enter the index of the book to check out: ");
                    int checkoutIndex = scanner.nextInt();
                    library.checkOutBook(checkoutIndex);
                    break;
                case 4:
                    library.displayBooks();
                    System.out.print("Enter the index of the book to check in: ");
                    int checkinIndex = scanner.nextInt();
                    library.checkInBook(checkinIndex);
                    break;
                case 5:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
