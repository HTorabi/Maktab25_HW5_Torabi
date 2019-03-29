public class Shoes extends Goods {
    Color color;

    public Shoes(int ID,String type, String producer, long price, int number, Color color) {
        super(ID,type, producer, price, number);
        this.color = color;
    }

    enum Color {BLACK, WHITE, BROWN,GREY}
}
