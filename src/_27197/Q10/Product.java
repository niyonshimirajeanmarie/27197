// File: Product.java
package _27197.q10;

public class Product extends Entity {
    private String productName;
    private String productCode;
    private double price; // > 0
    private Category category;

    public Product(int id, String productName, String productCode, double price, Category category) {
        super(id);
        setProductName(productName);
        setProductCode(productCode);
        setPrice(price);
        setCategory(category);
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) throw new IllegalArgumentException("productName cannot be empty");
        this.productName = productName.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) {
        if (productCode == null || productCode.trim().isEmpty()) throw new IllegalArgumentException("productCode cannot be empty");
        this.productCode = productCode.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("price must be > 0");
        this.price = price;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public Category getCategory() { return category; }
    public void setCategory(Category category) {
        if (category == null) throw new IllegalArgumentException("category cannot be null");
        this.category = category;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", price=" + price +
                ", category=" + category.getCategoryName() +
                '}';
    }
}
