package lesson_9.HommeWork_9;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell","Bedii", 1949, 4.9, true);
        Book b2 = new Book("Animal Farm", "George Orwell","Bedii", 1945, 4.8, true);
        Book b3 = new Book("Clean Code", " Robert Martin","Elmi", 2008, 4.7, true);
        Book b4 = new Book("Effective Java", "Joshua Bloch","Elmi", 2018, 4.9, true);
        Book b5 = new Book("The Pragmatic Programmer", "Andy Hunt","Elmi", 1999, 4.6, true);
        Book b6 = new Book("Java Concurrency in Practice", "Brian Goetz","Elmi", 2006, 4.5, true);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5, b6);

        User u1 = new User("Aydin", 25, Arrays.asList(
                new BorrowRecord(b1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)),
                new BorrowRecord(b3, LocalDate.of(2025, 10, 5), null)));

        User u2 = new User("Leyla", 22, Arrays.asList(
                new BorrowRecord(b4, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10,
                        20)),
                new BorrowRecord(b6, LocalDate.of(2025, 10, 12), null)
        ));
        User u3 = new User("Murad", 28, Arrays.asList(
                new BorrowRecord(b5, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 25))));


        List<User> users = Arrays.asList(u1, u2, u3);

        //1

        Comparator<Book> comparator = Comparator
                .comparing(Book::getRating)
                .reversed()
                .thenComparing(Book::getYear)
                .thenComparing(Book::getTitle);

        System.out.println("Sorted Books");
        books.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Library Analysis");

        //2

        double averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0.0);
        System.out.println("Average Rating " + averageRating);

        List<Book> availableAfter2000 = books.stream()
                .filter(b -> b.getYear() > 2000 && b.isAvailable())
                .collect(Collectors.toList());
        System.out.println("Available after 2000: " + availableAfter2000);
        System.out.println("  ");
        System.out.println("The most downloaded book by all users");

        //3

        Map<String, Long> borrowCount = users.stream()
                .flatMap(user -> user.getBorrowHistory().stream())
                .map(r -> r.getBook().getTitle())
                .collect(Collectors.groupingBy(title -> title, Collectors.counting()));

        String mostBorrowed = borrowCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No books borrowed");

        System.out.println("Most borrowed book: " + mostBorrowed );
        System.out.println(" ");
        System.out.println("Currently reading");

        //4

        Map<String, List<Book>> currentlyReading = users.stream()
                .collect(Collectors.toMap(User::getName,
                        user -> user.getBorrowHistory()
                                .stream()
                                .filter(borrowRecord -> !borrowRecord.isReturned())
                        .map(BorrowRecord::getBook)
                        .toList()));
        System.out.println("Currently reading: " + "\n" + currentlyReading);
        System.out.println(" ");
        System.out.println("Books grouped by author (after 1950)");

        //5

        Map<String, List<Book>> booksByAuthor = books.stream()
                .filter(book -> book.getYear() > 1950)
                .collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println("Books grouped by author (after 1950): " + booksByAuthor);
    }
    public Optional<Book> recommendBook(User user, List<Book> allBooks){


        Optional<BorrowRecord> lastRecord = user.getBorrowHistory().stream()
                .max(Comparator.comparing(BorrowRecord::getBorrowedDate));

        if (lastRecord.isEmpty()){
            return Optional.empty();
        }

        Book lastBook = lastRecord.get().getBook();
        String category = lastBook.getCategory();

        return allBooks.stream()
                .filter(book -> book.getCategory().equals(category))
                .filter(book -> !book.equals(lastBook))
                .findFirst();
    }
}
