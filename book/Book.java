
public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public boolean isOutdated(int maxAge) {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - year) > maxAge;
    }

    public abstract double buy(int quantity, String email, String address) throws Exception;
}

