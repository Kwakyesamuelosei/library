package io.turntabl;

public class Book {
    private String title;
    private int isbn;
    private Category category;
    private State state;

    public Book(String title, int isbn, Category category, State state) {
        this.title = title;
        this.isbn = isbn;
        this.category = category;
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", category=" + category +
                ", state=" + state +
                '}';
    }
}
