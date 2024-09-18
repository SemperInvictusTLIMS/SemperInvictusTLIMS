package AbcShopSystem;

public class Employee extends Person {
    private double hourlyWorked;
    private String jobTitle;

    // Default constructor
    public Employee() {
        super();
        this.hourlyWorked = 0.0;
        this.jobTitle = "DefaultJobTitle";
        setDiscount(); // Set discount for Employee based on hours worked
    }

    // Constructor with parameters
    public Employee(String firstName, String surname, String phoneNumber, int discount, double hourlyWorked, String jobTitle) {
        super(firstName, surname, phoneNumber, discount);
        this.hourlyWorked = hourlyWorked;
        this.jobTitle = jobTitle;
        setDiscount(); // Set discount for Employee based on hours worked
    }

    // Getters and Setters
    public double getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyWorked(double hourlyWorked) {
        this.hourlyWorked = hourlyWorked;
        setDiscount(); // Update discount when hours worked changes
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Overriding setDiscount method for Employees
    @Override
    public void setDiscount() {
        if (hourlyWorked < 20) {
            super.setDiscount(5); // 5% discount
        } else if (hourlyWorked >= 21 && hourlyWorked <= 30) {
            super.setDiscount(10); // 10% discount
        } else if (hourlyWorked > 30) {
            super.setDiscount(15); // 15% discount
        }
    }
}
