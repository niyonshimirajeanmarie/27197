
package _27197.q10;

import java.util.Objects;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, String storeName, String address, String email) {
        super(id);
        setStoreName(storeName);
        setAddress(address);
        setEmail(email);
    }

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) {
        if (storeName == null || storeName.trim().isEmpty()) throw new IllegalArgumentException("storeName cannot be empty");
        this.storeName = storeName.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) throw new IllegalArgumentException("address cannot be empty");
        this.address = address.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (!isValidEmail(email)) throw new IllegalArgumentException("invalid email");
        this.email = email;
        this.updatedDate = java.time.LocalDateTime.now();
    }

    private boolean isValidEmail(String email) {
        if (email == null) return false;
        email = email.trim();
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
