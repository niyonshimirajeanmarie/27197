// File: Shipping.java
package _27197.q10;

public class Shipping extends Entity {
    private String shippingAddress;
    private double shippingCost; // >= 0

    public Shipping(int id, String shippingAddress, double shippingCost) {
        super(id);
        setShippingAddress(shippingAddress);
        setShippingCost(shippingCost);
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) {
        if (shippingAddress == null || shippingAddress.trim().isEmpty()) throw new IllegalArgumentException("shippingAddress cannot be empty");
        this.shippingAddress = shippingAddress.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) {
        if (shippingCost < 0) throw new IllegalArgumentException("shippingCost must be >= 0");
        this.shippingCost = shippingCost;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "id=" + id +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
