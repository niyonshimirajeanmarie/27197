package _27197.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (ISBN.length() < 10) throw new LibraryDataException("ISBN must be ≥ 10 chars 27197");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
