import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your ID");
        String ID = scanner.nextLine();
        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();
        new UserRegistration(ID, password);
        System.out.println("Please Enter Your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please Enter Your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please Enter Your Phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please Enter Your Email");
        String email = scanner.nextLine();
        new UserInformation(firstName, lastName, phoneNumber, email);
        System.out.println("Please Enter Your City name");
        String city = scanner.nextLine();
        System.out.println("Please Enter Your Town name");
        String town = scanner.nextLine();
        System.out.println("Please Enter Your Street name");
        String streetName = scanner.nextLine();
        System.out.println("Please Enter Your Postal Code");
        String postalCode = scanner.nextLine();
        new UserAddress(city, town, streetName, postalCode);
        for (Goods g : GoodsList.goods)
            new GoodsShow(g);


        System.out.println("Enter Code of goods which you want");
        int id = scanner.nextInt();
        System.out.println("Enter Number of this");
        int num = scanner.nextInt();
    }
}
