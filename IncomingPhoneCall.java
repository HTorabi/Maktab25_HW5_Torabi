public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice(0.02);
    }
    void PhoneCallInformation(){
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Rate: "+getPrice());
        System.out.println("Price Of The Call: "+getPrice());
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void getInformation() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
