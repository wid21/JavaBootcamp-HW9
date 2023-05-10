public class Book extends Product{

    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

   @Override
   public double getDiscount(){
        int s=10;
       return getPrice() * s/100;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
