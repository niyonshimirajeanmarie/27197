// File: Invoice.java
package _27197.q10;

public class Invoice extends Entity {
    private double totalAmount; // > 0
    private Order order;
    private Payment payment;
    private Shipping shipping;

    public Invoice(int id, Order order, Payment payment, Shipping shipping) {
        super(id);
        setOrder(order);
        setPayment(payment);
        setShipping(shipping);
        computeAndSetTotal();
    }

    public double getTotalAmount() { return totalAmount; }

    private void computeAndSetTotal() {
        double subtotal = order.computeSubtotal();
        double total = subtotal + (shipping != null ? shipping.getShippingCost() : 0.0);
        if (total <= 0) throw new IllegalArgumentException("totalAmount must be > 0");
        this.totalAmount = total;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Order getOrder() { return order; }
    public void setOrder(Order order) {
        if (order == null) throw new IllegalArgumentException("order cannot be null");
        this.order = order;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) {
        if (payment == null) throw new IllegalArgumentException("payment cannot be null");
        this.payment = payment;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Shipping getShipping() { return shipping; }
    public void setShipping(Shipping shipping) {
        if (shipping == null) throw new IllegalArgumentException("shipping cannot be null");
        this.shipping = shipping;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", orderId=" + order.getOrderId() +
                ", paymentStatus=" + payment.getPaymentStatus() +
                '}';
    }
}
