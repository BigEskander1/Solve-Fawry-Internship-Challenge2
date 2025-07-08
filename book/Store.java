import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Book> books;

    public Store() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book " + book.title);
    }

    public List<Book> removeOutdatedBooks(int maxAge) {
        List<Book> removed = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.isOutdated(maxAge)) {
                removed.add(b);
                books.remove(i);
                System.out.println("Removed outdated book " + b.title);
                i--;
            }
        }

        return removed;
    }

    private Book findByIsbn(String isbn) throws Exception {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                return b;
            }
        }

        throw new Exception("Book with ISBN " + isbn + " not found");
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book book = findByIsbn(isbn);
        double total = book.buy(quantity, email, address);
        System.out.println("Paid amount " + total);
        return total;
    }
}
