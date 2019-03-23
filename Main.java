import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your ID");
        String ID=scanner.nextLine();
        System.out.println("Please Enter Your Password");
        String password=scanner.nextLine();
        new UserRegistration(ID,password);
        System.out.println("Please Enter Your first name");
        String firstName=scanner.nextLine();
        System.out.println("Please Enter Your last name");
        String lastName=scanner.nextLine();
        System.out.println("Please Enter Your Phone number");
        String phoneNumber=scanner.nextLine();
        System.out.println("Please Enter Your Email");
        String email=scanner.nextLine();
        new UserInformation(firstName,lastName,phoneNumber,email);
        System.out.println("Please Enter Your City name");
        String city=scanner.nextLine();
        System.out.println("Please Enter Your Town name");
        String town=scanner.nextLine();
        System.out.println("Please Enter Your Street name");
        String streetName=scanner.nextLine();
        System.out.println("Please Enter Your Postal Code");
        String postalCode=scanner.nextLine();
        new UserAddress(city,town,streetName,postalCode);
        for (Goods g:GoodsList.goods){
            System.out.println("Type: "+g.type);

            if (g instanceof Shoes)
                System.out.println("Color: "+((Shoes) g).color);
            if (g instanceof ElectricalDevices)
                System.out.println("Color: "+((ElectricalDevices)g).color);
            if (g instanceof Book)
                System.out.println("Name: "+((Book) g).name+"\n"+"Writer: "+((Book) g).writter);
            if (g instanceof Magazine)
                System.out.println("Name: "+((Magazine) g).name+"\n");
            System.out.println("Producer: "+g.producer);
            System.out.println("Price: "+g.price);
            System.out.println("Number: "+g.number);

            System.out.println("======================");
        }
    }
}
