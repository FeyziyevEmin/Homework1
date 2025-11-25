package lesson_9.HommeWork_9;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private boolean isAvailable;
    private String category;

    public Book(String title, String author, String category, int year, double rating, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return title + "   " + author + "   " + "(" + year + ")" + "   " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Double.compare(rating, book.rating) == 0 && isAvailable == book.isAvailable && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, rating, isAvailable);


    }
}

