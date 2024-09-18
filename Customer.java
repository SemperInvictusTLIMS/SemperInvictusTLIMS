package AbcShopSystem;

public class Customer extends Person {
    private String emailAddress;
    private String membershipLevel;

    // Default constructor
    public Customer() {
        super();
        this.emailAddress = "default@example.com";
        this.membershipLevel = "DefaultLevel";
        setDiscount(); // Set discount for Customer
    }

    // Constructor with parameters
    public Customer(String firstName, String surname, String phoneNumber, int discount, String emailAddress, String membershipLevel) {
        super(firstName, surname, phoneNumber, discount);
        this.emailAddress = emailAddress;
        this.membershipLevel = membershipLevel;
        setDiscount(); // Set discount for Customer
    }

    // Getters and Setters
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    // Overriding setDiscount method for Customers
    @Override
    public void setDiscount() {
        super.setDiscount(0); // Customers do not get any discount
    }
}
