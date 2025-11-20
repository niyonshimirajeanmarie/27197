// File: Order.java
package _27197.q10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order extends Entity {
    private LocalDate orderDate;
    private String orderId; // not empty
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Order(int id, LocalDate orderDate, String orderId, Customer customer) {
        super(id);
        setOrderDate(orderDate);
        setOrderId(orderId);
        setCustomer(customer);
    }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) {
        if (orderDate == null) throw new IllegalArgumentException("orderDate cannot be null");
        this.orderDate = orderDate;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) {
        if (orderId == null || orderId.trim().isEmpty()) throw new IllegalArgumentException("orderId cannot be empty");
        this.orderId = orderId.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) {
        if (customer == null) throw new IllegalArgumentException("customer cannot be null");
        this.customer = customer;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public void addProduct(Product p) {
        if (p == null) throw new IllegalArgumentException("product cannot be null");
        products.add(p);
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public List<Product> getProducts() { return products; }

    public double computeSubtotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", orderId='" + orderId + '\'' +
                ", customer=" + customer.getCustomerName() +
                ", products=" + products.size() +
                '}';
    }
}
