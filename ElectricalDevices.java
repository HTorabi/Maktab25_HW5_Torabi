public class ElectricalDevices extends Goods {
    String color;


    public ElectricalDevices(int ID,String type, String producer, long price, int number,String color) {
        super(ID,type, producer, price, number);
        this.color=color;

    }
}
