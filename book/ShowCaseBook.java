public class ShowCaseBook extends Book {
    public ShowCaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        throw new Exception("Not for sal ");
    }
}
