package _27197.q8;

import java.time.LocalDate;

public class Borrow extends Member {
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrow(int id, LocalDate createdDate, LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  LocalDate borrowDate, LocalDate returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        if (borrowDate == null || returnDate == null) throw new LibraryDataException("Borrow/Return date cannot be null 27197");
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}
