package AbcShopSystem;

import java.util.Scanner;

public class AbcShopDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Create two Employee objects
        // Object 1: Using parameterized constructor
        System.out.println("Enter details for Employee 1 (parameterized):");
        System.out.print("First Name: ");
        String e1FirstName = scanner.nextLine();
        System.out.print("Surname: ");
        String e1Surname = scanner.nextLine();
        System.out.print("Phone Number: ");
        String e1PhoneNumber = scanner.nextLine();
        System.out.print("Hours Worked: ");
        double e1HoursWorked = scanner.nextDouble();
        scanner.nextLine();  // consume newline
        System.out.print("Job Title: ");
        String e1JobTitle = scanner.nextLine();

        Employee employee1 = new Employee(e1FirstName, e1Surname, e1PhoneNumber, 0, e1HoursWorked, e1JobTitle);

        // Object 2: Using default constructor and set methods
        System.out.println("\nEnter details for Employee 2 (using setters):");
        Employee employee2 = new Employee();
        System.out.print("First Name: ");
        employee2.setFirstName(scanner.nextLine());
        System.out.print("Surname: ");
        employee2.setSurname(scanner.nextLine());
        System.out.print("Phone Number: ");
        employee2.setPhoneNumber(scanner.nextLine());
        System.out.print("Hours Worked: ");
        employee2.setHourlyWorked(scanner.nextDouble());
        scanner.nextLine();  // consume newline
        System.out.print("Job Title: ");
        employee2.setJobTitle(scanner.nextLine());

        // b. Create two Customer objects
        // Object 1: Using parameterized constructor
        System.out.println("\nEnter details for Customer 1 (parameterized):");
        System.out.print("First Name: ");
        String c1FirstName = scanner.nextLine();
        System.out.print("Surname: ");
        String c1Surname = scanner.nextLine();
        System.out.print("Phone Number: ");
        String c1PhoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        String c1EmailAddress = scanner.nextLine();
        System.out.print("Membership Level: ");
        String c1MembershipLevel = scanner.nextLine();

        Customer customer1 = new Customer(c1FirstName, c1Surname, c1PhoneNumber, 0, c1EmailAddress, c1MembershipLevel);

        // Object 2: Using default constructor and set methods
        System.out.println("\nEnter details for Customer 2 (using setters):");
        Customer customer2 = new Customer();
        System.out.print("First Name: ");
        customer2.setFirstName(scanner.nextLine());
        System.out.print("Surname: ");
        customer2.setSurname(scanner.nextLine());
        System.out.print("Phone Number: ");
        customer2.setPhoneNumber(scanner.nextLine());
        System.out.print("Email Address: ");
        customer2.setEmailAddress(scanner.nextLine());
        System.out.print("Membership Level: ");
        customer2.setMembershipLevel(scanner.nextLine());

        // c. Create two Supplier objects
        // Object 1: Using parameterized constructor
        System.out.println("\nEnter details for Supplier 1 (parameterized):");
        System.out.print("First Name: ");
        String s1FirstName = scanner.nextLine();
        System.out.print("Surname: ");
        String s1Surname = scanner.nextLine();
        System.out.print("Phone Number: ");
        String s1PhoneNumber = scanner.nextLine();
        System.out.print("Company Name: ");
        String s1CompanyName = scanner.nextLine();
        System.out.print("Supplier Status (Past Supplier, Future Supplier, Active Supplier): ");
        String s1SupplierStatus = scanner.nextLine();
        System.out.print("Delivery Time: ");
        String s1DeliveryTime = scanner.nextLine();

        Supplier supplier1 = new Supplier(s1FirstName, s1Surname, s1PhoneNumber, 0, s1CompanyName, s1SupplierStatus, s1DeliveryTime);

        // Object 2: Using default constructor and set methods
        System.out.println("\nEnter details for Supplier 2 (using setters):");
        Supplier supplier2 = new Supplier();
        System.out.print("First Name: ");
        supplier2.setFirstName(scanner.nextLine());
        System.out.print("Surname: ");
        supplier2.setSurname(scanner.nextLine());
        System.out.print("Phone Number: ");
        supplier2.setPhoneNumber(scanner.nextLine());
        System.out.print("Company Name: ");
        supplier2.setCompanyName(scanner.nextLine());
        System.out.print("Supplier Status (Past Supplier, Future Supplier, Active Supplier): ");
        supplier2.setSupplierStatus(scanner.nextLine());
        System.out.print("Delivery Time: ");
        supplier2.setDeliveryTime(scanner.nextLine());

        // d. Display the details of all objects and the amount of discount they receive

        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee 1: " + employee1);
        System.out.println("Discount: " + employee1.getDiscount() + "%");

        System.out.println("Employee 2: " + employee2);
        System.out.println("Discount: " + employee2.getDiscount() + "%");

        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer 1: " + customer1);
        System.out.println("Discount: " + customer1.getDiscount() + "%");

        System.out.println("Customer 2: " + customer2);
        System.out.println("Discount: " + customer2.getDiscount() + "%");

        System.out.println("\n--- Supplier Details ---");
        System.out.println("Supplier 1: " + supplier1);
        System.out.println("Discount: " + supplier1.getDiscount() + "%");

        System.out.println("Supplier 2: " + supplier2);
        System.out.println("Discount: " + supplier2.getDiscount() + "%");

        scanner.close();
    }
}
