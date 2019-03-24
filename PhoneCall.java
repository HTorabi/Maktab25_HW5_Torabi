public abstract class PhoneCall {
    String phoneNumber;
    double price;
    PhoneCall(String phoneNumber){
        this.price=0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInformation();

}

