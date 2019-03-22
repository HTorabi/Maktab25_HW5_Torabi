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
    public void sold() {
        number--;
    }

    public void regained() {
        number++;
    }

    public String getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public long getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}
