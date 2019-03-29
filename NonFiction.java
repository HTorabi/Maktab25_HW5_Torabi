public class NonFiction extends Book {
    final static double nonFictionPrice=37.99;

    public NonFiction(String title,double nonFictionPrice) {
        super(title);
        setPrice(nonFictionPrice);
    }

    @Override
    void setPrice(double nonFictionPrice){
        this.price=nonFictionPrice;

    }
}
