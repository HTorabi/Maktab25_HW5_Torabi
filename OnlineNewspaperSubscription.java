public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    void setAddress(String address){
        this.address=address;
        if (address.contains("@"))
            rate=9;
        else
            System.out.println("Error! Address does not contain any @");

    }

}
