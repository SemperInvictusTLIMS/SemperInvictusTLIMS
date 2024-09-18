package AbcShopSystem;

public class Supplier extends Person {
    private String companyName;
    private String supplierStatus;
    private String deliveryTime;

    // Default constructor
    public Supplier() {
        super();
        this.companyName = "DefaultCompanyName";
        this.supplierStatus = "DefaultStatus";
        this.deliveryTime = "DefaultDeliveryTime";
        setDiscount(); // Set discount for Supplier based on status
    }

    // Constructor with parameters
    public Supplier(String firstName, String surname, String phoneNumber, int discount, String companyName, String supplierStatus, String deliveryTime) {
        super(firstName, surname, phoneNumber, discount);
        this.companyName = companyName;
        this.supplierStatus = supplierStatus;
        this.deliveryTime = deliveryTime;
        setDiscount(); // Set discount for Supplier based on status
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
        setDiscount(); // Update discount when supplier status changes
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    // Overriding setDiscount method for Suppliers
    @Override
    public void setDiscount() {
        switch (supplierStatus) {
            case "Past Supplier":
                super.setDiscount(5); // 5% discount
                break;
            case "Future Supplier":
                super.setDiscount(10); // 10% discount
                break;
            case "Active Supplier":
                super.setDiscount(15); // 15% discount
                break;
            default:
                super.setDiscount(0); // No discount for unknown status
                break;
        }
    }
}
