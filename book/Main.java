public class Main {
    public static void main(String[] args) {
        try {
            Store store = new Store();

            PaperBook paperBook = new PaperBook("111", "Java", 2018, 100.0, "John Doe", 5);
            EBook eBook = new EBook("222", "c++", 2020, 50.0, "Jane Smith", "PDF");
            ShowCaseBook showcaseBook = new ShowCaseBook("333", "Python", 2010, 200.0, "Author");

            store.addBook(paperBook);
            store.addBook(eBook);
            store.addBook(showcaseBook);

            store.buyBook("111", 2, "a", "Shobra");
            store.buyBook("222", 1, "a", null);

            store.removeOutdatedBooks(10);

            store.buyBook("333", 1, "buyer@example.com", "Cairo");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
