public abstract class Book {
    String title;
    double price;
    Book(String title){
        this.title=title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    abstract void setPrice(double price);
}

