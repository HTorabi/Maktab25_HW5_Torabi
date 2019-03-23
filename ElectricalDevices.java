public class ElectricalDevices extends Goods {
    String color;


    public ElectricalDevices(String type, String producer, long price, int number,String color) {
        super(type, producer, price, number);
        this.color=color;

    }
}
