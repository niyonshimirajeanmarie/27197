// File: Main.java
package _27197.q10;

import java.time.LocalDate;

public class Main {
    // Student ID to concatenate with outputs
    private static final String STUDENT_ID = "27197";

    public static void main(String[] args) {
        try {
            // create store
            Store store = new Store(1, "JM Online Store", "Kigali, Rwanda", "jm.store@example.com");

            // categories
            Category electronics = new Category(2, "Electronics", "ELE");
            Category books = new Category(3, "Books", "BKS");

            // products
            Product phone = new Product(4, "Smartphone X", "PX-100", 299.99, electronics);
            Product laptop = new Product(5, "Laptop Pro", "LP-200", 899.50, electronics);
            Product novel = new Product(6, "Novel A", "NV-01", 12.75, books);

            // customer
            Customer customer = new Customer(7, "Alice Example", "+250780000000", "Kigali Street 123");

            // order
            Order order = new Order(8, LocalDate.now(), "ORD-0001", customer);
            order.addProduct(phone);
            order.addProduct(novel); // two items

            // payment & shipping
            Payment payment = new Payment(9, "Credit Card", "PAID");
            Shipping shipping = new Shipping(10, "Customer Address: Kigali Street 123", 5.25);

            // invoice
            Invoice invoice = new Invoice(11, order, payment, shipping);

            // order record
            OrderRecord record = new OrderRecord(12, order, invoice);

            // print outputs concatenated with student ID as required
            System.out.println(store.toString() + " " + STUDENT_ID);
            System.out.println(electronics.toString() + " " + STUDENT_ID);
            System.out.println(phone.toString() + " " + STUDENT_ID);
            System.out.println(customer.toString() + " " + STUDENT_ID);
            System.out.println(order.toString() + " " + STUDENT_ID);
            System.out.println(payment.toString() + " " + STUDENT_ID);
            System.out.println(shipping.toString() + " " + STUDENT_ID);
            System.out.println(invoice.toString() + " " + STUDENT_ID);
            System.out.println(record.toString() + " " + STUDENT_ID);

            // neat summary
            System.out.println("---- SUMMARY ---- " + STUDENT_ID);
            System.out.println("Order subtotal: " + order.computeSubtotal() + " " + STUDENT_ID);
            System.out.println("Invoice total: " + invoice.getTotalAmount() + " " + STUDENT_ID);

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage() + " " + STUDENT_ID);
        }
    }
}
