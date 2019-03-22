public class User {
    private String ID,password,firstName,lastName,phoneNumber,city,town,streetName,email,postalCode;
    public User(String ID, String password, String firstName, String lastName, String phoneNumber,
                String email, String city, String town, String streetName, String postalCode) {
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
