package DayEleven;

import java.util.ArrayList;
import java.util.List;

// ! Library class - Manages books and Lending..
public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // * Add a book DRY: Single method for adding books
    public void addBook(Book book) {
        this.books.add(book);
    }

    // * Add a member DRY: single method for adding members
    public void addMember(Member member) {
        this.members.add(member);
    }

    // * Lend a book to a member (Law of Demeter: interacts only with direct objects)
    public void lendBook(String bookTitle, String memberId) {
        Book book = findBookByTitle(bookTitle);
        Member member = findMemberById(memberId);

        if (book != null && member != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book unavailable or member/book not found.");
        }
    }

    // Helper method (keeps logic DRY and simple)
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

/*
   * Law of Demeter:
        lendBook only interacts with Book and Member objects directly (via their methods like getName(),
        isAvailable()), not their internal structures. It doesn’t do something like book.getSomeNestedObject().doSomething().
   * DRY:
        The findBookByTitle and findMemberById methods centralize search logic, avoiding repetition in multiple places.
   * KISS:
        The lending logic is straightforward: find the book, find the member, check availability, and update.
   * Cohesion:
        Library focuses solely on managing books and members, not unrelated tasks like sending emails or printing receipts.
   * Low Coupling:
         Library depends only on Book and Member abstractions, not their internals
 */

/*
    YAGNI: For now we will keep it minimal, just lending and displaying books. Extra features can be added later if needed.
 */



