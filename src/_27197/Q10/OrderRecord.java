// File: OrderRecord.java
package _27197.q10;

import java.time.LocalDateTime;

public class OrderRecord extends Entity {
    private Order order;
    private Invoice invoice;
    private LocalDateTime recordedAt;

    public OrderRecord(int id, Order order, Invoice invoice) {
        super(id);
        setOrder(order);
        setInvoice(invoice);
        this.recordedAt = LocalDateTime.now();
    }

    public Order getOrder() { return order; }
    public void setOrder(Order order) {
        if (order == null) throw new IllegalArgumentException("order cannot be null");
        this.order = order;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) {
        if (invoice == null) throw new IllegalArgumentException("invoice cannot be null");
        this.invoice = invoice;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public LocalDateTime getRecordedAt() { return recordedAt; }

    @Override
    public String toString() {
        return "OrderRecord{" +
                "id=" + id +
                ", orderId=" + order.getOrderId() +
                ", invoiceTotal=" + invoice.getTotalAmount() +
                ", recordedAt=" + recordedAt +
                '}';
    }
}
