public class Readable extends Goods {
    String name;

    public Readable(String type, String producer, long price, int number, String name) {
        super(type, producer, price, number);
        this.name = name;
    }
}
