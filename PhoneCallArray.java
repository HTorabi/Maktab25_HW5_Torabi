import java.util.Scanner;

public class PhoneCallArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall[] phoneCalls = new PhoneCall[2];
        int i=0;
        while (true){
            System.out.println("Incoming or Outgoing Phone Call?");
            String s=scanner.nextLine();
            if (s.equalsIgnoreCase("incoming")) {
                System.out.println("Enter Phone Number");
                phoneCalls[i] = new IncomingPhoneCall(scanner.nextLine());
                i++;
            }
            if (s.equalsIgnoreCase("outgoing")) {
                System.out.println("Enter Phone Number");
                String phone = scanner.nextLine();
                System.out.println("Enter Time in Minute");
                Scanner scanner1=new Scanner(System.in);
                int time = scanner1.nextInt();
                phoneCalls[i] = new OutgoingPhoneCall(phone, time);
                i++;
            }
            if (i==phoneCalls.length)
                break;
        }
        for (PhoneCall phoneCall:phoneCalls)
            phoneCall.getInformation();

    }
}
