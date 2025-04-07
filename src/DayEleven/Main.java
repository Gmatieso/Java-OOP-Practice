package DayEleven;

public class Main {
    // ! PRINCIPLE OVERVIEW
    /*
        !LAW OF DEMETER:
         Don't talk to strangers!. A method should only interact with objects it directly knows i.e. parameters, fields, objects it creates. not deeply nested structures
        !KISS (Keep It Simple, Stupid)
        Favor simple, straightforward solutions over complex ones.
        !YAGNI (You Aren't Gonna Need it) .
        Don't add functionality until it's acutally required.
        !DRY (DON'T REPEAT YOURSELF):
        Avoid duplication by abstracting reusable code into single, well-defined locations.
        !Cohension:
        A module (class/method) should have a single, focused purpose with closely related responsibilities.
        !Coupling:
        Minimize dependencies btwn modules to make them independent and easier to change.

     */
    public static void main(String[] args) {
        Library library = new Library();

        //Add books and members
        Book book1 = new Book("The Hobbit", "J R.R. Tolkien");
        Book book2 = new Book("1984", "George Orwell");
        Member member1 = new Member("James", "M001");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);


        // Display initial state
        System.out.println("Books in library:");
        library.displayBooks();

        //Lend a book
        System.out.println("\nLending a book:");
        library.lendBook("The Hobbit", "M001");

        // Display updated state
        System.out.println("\nBooks in library after lending:");
        library.displayBooks();

    }
}

/*
    ! Cohension: Book focuses on book-related data and state. Member focuses on member details . Each class has a single, clear purpose.
    ! KISS:  Simple getter and setters, no overcomplicated logic.

 */
