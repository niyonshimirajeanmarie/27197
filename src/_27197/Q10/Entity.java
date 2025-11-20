
package _27197.q10;

import java.time.LocalDateTime;

public class Entity {
    protected int id;
    protected LocalDateTime createdDate;
    protected LocalDateTime updatedDate;

    public Entity(int id) {
        setId(id);
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }

    public int getId() { return id; }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
        this.updatedDate = LocalDateTime.now();
    }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public LocalDateTime getUpdatedDate() { return updatedDate; }
}
