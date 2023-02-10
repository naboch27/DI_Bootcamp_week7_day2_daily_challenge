public class Book extends Author {

    private String title;
    private int price;
    private int qty;

    public Book(String name, String title, int price, int qty) {
        super(name);
        this.title = title;
        this.price = price;
        this.qty = qty;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", price=" + price +
                ", qty=" + qty + ", Author name=" + super.getName() + "]";
    }

}
