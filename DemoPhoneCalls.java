public class DemoPhoneCalls {
    public static void main(String[] args) {
        new OutgoingPhoneCall("09124355658",10).getInformation();
        new IncomingPhoneCall("09391445525").getInformation();
    }
}
