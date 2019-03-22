public abstract class Goods {
    private long price;
    private int number;
    

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void selled() {
        number--;
    }

   void regained() {
        number++;
    }
}
