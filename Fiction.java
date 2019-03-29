public class Fiction extends Book {
    final static double fictionPrice=24.99;

    public Fiction(String title,double fictionPrice) {
        super(title);
        setPrice(fictionPrice);
    }

    @Override
    void setPrice(double fictionPrice){
        this.price=fictionPrice;

    }
}
