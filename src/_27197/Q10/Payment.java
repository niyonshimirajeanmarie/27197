// File: Payment.java
package _27197.q10;

public class Payment extends Entity {
    private String paymentMethod;
    private String paymentStatus; // not empty

    public Payment(int id, String paymentMethod, String paymentStatus) {
        super(id);
        setPaymentMethod(paymentMethod);
        setPaymentStatus(paymentStatus);
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new IllegalArgumentException("paymentMethod cannot be empty");
        this.paymentMethod = paymentMethod.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) {
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) throw new IllegalArgumentException("paymentStatus cannot be empty");
        this.paymentStatus = paymentStatus.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
