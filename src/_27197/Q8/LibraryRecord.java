package _27197.q8;

public final class LibraryRecord extends Record {

    public LibraryRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String ISBN,
                         String memberName, int memberId, String contactNumber,
                         java.time.LocalDate borrowDate, java.time.LocalDate returnDate,
                         double fineAmount, int daysLate,
                         java.time.LocalDate paymentDate, String paymentMode,
                         double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public void displayRecord() {
        System.out.println("=== Library Record 27197 ===");
        System.out.println("Total Fine: $" + getTotalFine() + " 27197");
        System.out.println("=========================== 27197");
    }
}
