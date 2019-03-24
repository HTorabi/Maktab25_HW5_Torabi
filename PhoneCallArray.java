import java.util.Scanner;

public class PhoneCallArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall[] phoneCalls = new PhoneCall[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Incoming or Outgoing Phone Call?");
            if (scanner.nextLine().equalsIgnoreCase("incoming")) {
                System.out.println("Enter Phone Number");
                phoneCalls[i] = new IncomingPhoneCall(scanner.nextLine());
            } else {
                System.out.println("Enter Phone Number");
                String phone = scanner.nextLine();
                System.out.println("Enter Time in Minute");
                Scanner scanner1=new Scanner(System.in);
                int time = scanner1.nextInt();
                phoneCalls[i] = new OutgoingPhoneCall(phone, time);

            }
        }
        for (PhoneCall phoneCall:phoneCalls)
            phoneCall.getInformation();

    }
}
