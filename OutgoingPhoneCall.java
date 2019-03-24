public abstract class OutgoingPhoneCall extends PhoneCall  {
    int time;

    public OutgoingPhoneCall(String phoneNumber,int time) {
        super(phoneNumber);
        this.time = time;
        setPrice(0.04);
    }
    void PhoneCallInformation(){
        System.out.println(phoneNumber);
        System.out.println(price);
        System.out.println(time);
        System.out.println(time*price);
    }

}
