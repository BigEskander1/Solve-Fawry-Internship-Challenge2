public class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        if (quantity > 1) {
            throw new Exception("Only 1 copy allowed");
        }
        System.out.println("Sending to " + email);
        return price;
    }
}
