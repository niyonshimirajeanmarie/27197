package _27197.q8;

public class Record extends Payment {
    private double totalFine;

    public Record(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  java.time.LocalDate borrowDate, java.time.LocalDate returnDate,
                  double fineAmount, int daysLate,
                  java.time.LocalDate paymentDate, String paymentMode,
                  double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        if (totalFine <= 0) throw new LibraryDataException("Total fine must be > 0 27197");
        this.totalFine = totalFine;
    }

    public double getTotalFine() { return totalFine; }
}
