package _27143.Q4;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }

    // Getters
    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDate updatedDate) { this.updatedDate = updatedDate; }
}
