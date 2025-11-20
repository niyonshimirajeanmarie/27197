// File: Customer.java
package _27197.q10;

public class Customer extends Entity {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(int id, String customerName, String contactNumber, String address) {
        super(id);
        setCustomerName(customerName);
        setContactNumber(contactNumber);
        setAddress(address);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) throw new IllegalArgumentException("customerName cannot be empty");
        this.customerName = customerName.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || contactNumber.trim().isEmpty()) throw new IllegalArgumentException("contactNumber cannot be empty");
        this.contactNumber = contactNumber.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) throw new IllegalArgumentException("address cannot be empty");
        this.address = address.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
