import java.util.Scanner;
public class DemoSubscriptions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Online or Physical subscription");
        if (scanner.nextLine().equalsIgnoreCase("online")) {
            NewspaperSubscription p=new OnlineNewspaperSubscription();
            displayInformation(p);

        }
        else {
            NewspaperSubscription p = new PhysicalNewspaperSubscription();
            displayInformation(p);
        }


    }
    static void displayInformation(NewspaperSubscription p){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name");
        p.setSubscriberName(scanner.nextLine());
        System.out.println("Enter your Address");
        p.setAddress(scanner.nextLine());
        System.out.println("Name: "+p.getSubscriberName());
        System.out.println("Address: "+p.getAddress());
        System.out.println("Rate: "+p.rate);
    }
}
