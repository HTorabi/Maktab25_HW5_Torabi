import java.util.Scanner;
public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("This Book is fiction or nonfiction?");
            if(scanner.nextLine().equalsIgnoreCase("fiction")) {
                System.out.println("Enter its title");
                books[i]=new Fiction(scanner.nextLine(),Fiction.fictionPrice);

            }
            else{
                System.out.println("Enter its title");
                books[i]=new NonFiction(scanner.nextLine(),NonFiction.nonFictionPrice);

            }
        }
        for (Book book:books)
            System.out.println(book.title+"\n"+book.price+"\n"+"==========");
    }

}
