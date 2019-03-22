public abstract class Goods {
     String type;
     String producer;
     long price;
     int number;

    public Goods(String type, String producer, long price, int number) {
        this.type = type;
        this.producer = producer;
        this.price = price;
        this.number = number;
    }
    void selled() {
        number--;
    }

    void regained() {
        number++;
    }
}
