import java.util.Scanner;
public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.println("This Book is fiction or nonfiction?");
                String s=scanner.nextLine();
                if (s.equalsIgnoreCase("fiction")) {
                    System.out.println("Enter its title");
                    books[i] = new Fiction(scanner.nextLine(), Fiction.fictionPrice);
                    break;

                }
                if (s.equalsIgnoreCase("nonfiction")) {
                    System.out.println("Enter its title");
                    books[i] = new NonFiction(scanner.nextLine(), NonFiction.nonFictionPrice);
                    break;

                }
            }
        }
        for (Book book:books)
            System.out.println(book.title+"\n"+book.price+"\n"+"==========");
    }

}
