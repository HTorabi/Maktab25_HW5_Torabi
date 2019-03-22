public class User {
    String city;
    String town;
    String streetName;
    private String ID;
    private long password;
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String email;
    private long postalCode;

    public User(String ID, long password, String firstName, String lastName, long phoneNumber, String email, String city, String town, String streetName, long postalCode) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.town = town;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }
}
