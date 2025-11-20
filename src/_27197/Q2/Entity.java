package _27197.q2;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws SchoolDataException {
        if (id <= 0) throw new SchoolDataException("ID must be > 0 27197");
        if (createdDate == null || updatedDate == null) throw new SchoolDataException("Dates cannot be null 27197");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }
}
