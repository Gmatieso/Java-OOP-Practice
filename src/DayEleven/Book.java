package DayEleven;

// !Book class - High cohesion:  only manages book data
// ! Cohesion: A module (class/method) should hv  a single, focused purpose with closely related responsibilities.
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // simple initialization (KISS)
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return title + "by" + author + (isAvailable ? "(available)" : "(Checked Out)");
    }


}
