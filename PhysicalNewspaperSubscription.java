import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    @Override
    void setAddress(String address){
        this.address=address;
        Pattern pattern=Pattern.compile("(.)*(\\d)(.)*");
        Matcher matcher = pattern.matcher(address);
        boolean isMatched = matcher.matches();
        if (!isMatched) {
            System.out.println("Error! Address doesn't contain any number");
            rate=0;

        }
        else
            rate=15;
    }
}
