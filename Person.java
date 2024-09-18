package AbcShopSystem;

public class Person {
    private String firstName;
    private String surname;
    private String phoneNumber;
    private int discount;

    // Default constructor
    public Person() {
        this.firstName = "DefaultFirstName";
        this.surname = "DefaultSurname";
        this.phoneNumber = "000-000-0000";
        this.discount = 0;
    }

    // Constructor with parameters
    public Person(String firstName, String surname, String phoneNumber, int discount) {
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // Method to be overridden in subclasses
    public void setDiscount() {
        // Default implementation (can be empty)
    }

    // toString() method
    @Override
    public String toString() {
        return "Person [FirstName=" + getFirstName() + 
               ", Surname=" + getSurname() + 
               ", PhoneNumber=" + getPhoneNumber() + 
               ", Discount=" + getDiscount() + "]";
    }
}
