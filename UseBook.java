import java.awt.print.Book;
import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("This Book is fiction or nonfiction?");
            if(scanner.nextLine().equalsIgnoreCase("fiction")) {
                System.out.println("Enter its title");
                Fiction book =new Fiction(scanner.nextLine(),Fiction.fictionPrice);
                System.out.println(book.title);
                System.out.println(book.price);
            }
            else{
                System.out.println("Enter its title");
                NonFiction book=new NonFiction(scanner.nextLine(),NonFiction.nonFictionPrice);
                System.out.println(book.title);
                System.out.println(book.price);


            }



        }

    }
