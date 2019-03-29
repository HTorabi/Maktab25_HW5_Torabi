public class Book extends Readable {
    String writter;

    public Book(int ID,String type, String producer, long price, int number, String name, String writter) {
        super(ID,type, producer, price, number, name);
        this.writter = writter;
    }
}
