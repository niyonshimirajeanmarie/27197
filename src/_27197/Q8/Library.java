package _27197.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new LibraryDataException("Phone must be 10 digits 27197");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
}
