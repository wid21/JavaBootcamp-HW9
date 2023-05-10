public class Movie extends Product {

private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }


    @Override
    public double getDiscount(){
        int d =15;
        return getPrice()* d /100;

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
