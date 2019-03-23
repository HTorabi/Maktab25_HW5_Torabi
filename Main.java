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
        Goods[] item = new Goods[5];
        int i = 0;
        while (true) {

            System.out.println("Enter Code of goods which you want");
            int id = scanner.nextInt();
            System.out.println("Enter Number of this");
            int num = scanner.nextInt();
            System.out.println("Your Shopping BOX");
//            item[i] = new ShoppingBox(id, num);
            for (Goods g : GoodsList.goods) {
                if (g.ID == id) {
                    g.number -= num;
                    item[i] = g;
                }
            }
            System.out.println("Do you want to remove any Item? y/n");
            Scanner scanner1 = new Scanner(System.in);
            String yn = scanner1.nextLine();
            if (yn.equalsIgnoreCase("y")) {
                System.out.println("For removing any item Enter its code");
                int code = scanner.nextInt();
                for (int j = 0; j <= i; j++)
                    if (item[j].ID == code)
                        for (int k = 1; k < i; k++)
                            if (j + k < 5)
                                item[j] = item[j + k];
            }
            if (yn.equalsIgnoreCase("n")) {
                i++;
                if (i == 5) {
                    System.out.println("Maximum item is 5");
                    break;
                }


            }
            System.out.println("if you want to finalize your box Enter Exit");
            Scanner scanner2 = new Scanner(System.in);
            if (scanner2.nextLine().equalsIgnoreCase("exit"))
                break;

        }
        for (Goods it : item)
            if (it != null)
                new GoodsShow(it);
    }
}