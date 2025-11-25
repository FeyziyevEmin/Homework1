package lesson_4;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("salam","Robert", "14323124");
        book.borrowBook();
        book.printInfo();
        book.returnBook();
        book.printInfo();
        book.returnBook();
        Book.libraryRules();
    }
}
