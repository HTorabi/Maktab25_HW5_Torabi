public abstract class NewspaperSubscription {
    String subscriberName;
    String address;
    int rate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getAddress() {
        return address;
    }

    public int getRate() {
        return rate;
    }
   abstract void setAddress(String address);
}
