import java.util.Scanner;
public class DemoSubscriptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewspaperSubscription[] newspaperSubscriptions = new NewspaperSubscription[3];
        for (int i=0;i<newspaperSubscriptions.length;i++) {
            while (true) {
                System.out.println("Online or Physical subscription");
                String s=scanner.nextLine();
                if (s.equalsIgnoreCase("online")) {
                    newspaperSubscriptions[i] = new OnlineNewspaperSubscription();
                    getInformation(newspaperSubscriptions[i]);
                    break;

                }
                if (s.equalsIgnoreCase("physical")) {
                    newspaperSubscriptions[i] = new PhysicalNewspaperSubscription();
                    getInformation(newspaperSubscriptions[i]);
                    break;
                }
            }
        }
        for (NewspaperSubscription n:newspaperSubscriptions)
            displayInformation(n);
    }
    static void getInformation(NewspaperSubscription p){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name");
        p.setSubscriberName(scanner.nextLine());
        System.out.println("Enter your Address");
        p.setAddress(scanner.nextLine());

    }
    static void displayInformation(NewspaperSubscription p){
        System.out.println("Name: "+p.getSubscriberName());
        System.out.println("Address: "+p.getAddress());
        System.out.println("Rate: "+p.rate);
        System.out.println("===========");
    }
}
