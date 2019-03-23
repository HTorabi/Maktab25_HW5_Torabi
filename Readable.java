public class Readable extends Goods {
    String name;

    public Readable(int ID,String type, String producer, long price, int number, String name) {
        super(ID,type, producer, price, number);
        this.name = name;
    }
}
