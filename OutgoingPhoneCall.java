public class OutgoingPhoneCall extends PhoneCall  {
    int time;

    public OutgoingPhoneCall(String phoneNumber,int time) {
        super(phoneNumber);
        this.time = time;
        setPrice(0.04);
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void getInformation() {
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Price: "+price);
        System.out.println("Time: "+time);
        System.out.println("Total Price: "+time*price);
        System.out.println("=========");

    }

    @Override
    public double getPrice() {
        return price;
    }

}
