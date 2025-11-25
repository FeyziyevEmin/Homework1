package lesson_4;

public class Book {
    private String title;
    private String author;
    private String isbn;
    protected int totalCopies;
    protected int availableCopies;

    //initializer block
    {
        System.out.println("New book created");
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = 1;
        this.availableCopies = 1;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            System.out.println("Book borrowed successfully. ");
            availableCopies--;
        } else {
            System.out.println("Sorry no copies available. ");
        }
    }

    public void returnBook() {
        if (totalCopies > availableCopies) {
            availableCopies++;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("All copies are already in the library.");
        }
    }

    public void printInfo() {
        System.out.println("" +
                "\nBook info: " +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nIsbn: " + isbn +
                "\nTotal copies: " + totalCopies +
                "\nAvailable copies: " + availableCopies);
    }

    public static void libraryRules() {
        System.out.println("Max 3 can be borrowed per person. ");
    }

    public final void bookType() {
        System.out.println("This is a regular book. ");
    }
}
