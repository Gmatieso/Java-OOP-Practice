package Dayone.assignment2.LibraryManagementSystem;


public class Book {
    //instance variable
    String title;
    String author;
    boolean isAvailable;

    Book() {}

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    void borrowBook() {
        isAvailable = false;
    }

    void returnBook() {
        isAvailable = true;
    }

    void printBookDetails() {
        System.out.println("Title:" + this.title + " Author:" + this.author + " isAvailable:" + this.isAvailable);
    }


    public static void main(String[] args) {
        // Initialize
        Book book = new Book();
        book.title = "Intro 2 Microservices";
        book.author = "Bob";
        book.isAvailable = true;
        book.borrowBook();
        book.returnBook();
        book.printBookDetails();




        Book book1 = new Book("Java17", "Elara Drevyn", true);
        book1.borrowBook();
//        book1.returnBook();
        book1.printBookDetails();

    }
}

