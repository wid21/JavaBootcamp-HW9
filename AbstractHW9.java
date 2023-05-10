// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AbstractHW9 {
    public static void main(String[] args) {

        Book b1 = new Book("The Giver", 250,"Lois Lowry");
        System.out.println("The name of the book is : " + b1.getName()+  ", The author of the book is : " +
         b1.getAuthor() +" , The price is : "+ b1.getPrice() + ", The amount of discount by 10% is : " +b1.getDiscount());

        Movie m1= new Movie("John Wick", 400,"Derek Kolstad");
        System.out.println("The name of the movie is : " + m1.getName()+  ", The Director of the movie is : "
         + m1.getDirector()+ " , The price is : "+ m1.getPrice() + ", The amount of discount by 15% is : " +m1.getDiscount());

    }
}