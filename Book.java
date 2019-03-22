public class Book extends Readable {
    String writter;

    public Book(String type, String producer, long price, int number, String name, String writter) {
        super(type, producer, price, number, name);
        this.writter = writter;
    }
}
