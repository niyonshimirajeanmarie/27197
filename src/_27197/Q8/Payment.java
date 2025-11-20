package _27197.q8;

import java.time.LocalDate;

public class Payment extends Fine {
    private LocalDate paymentDate;
    private String paymentMode;

    public Payment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String ISBN,
                   String memberName, int memberId, String contactNumber,
                   java.time.LocalDate borrowDate, java.time.LocalDate returnDate,
                   double fineAmount, int daysLate,
                   LocalDate paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        if (paymentDate == null || paymentMode.isEmpty()) throw new LibraryDataException("Payment date/mode cannot be empty 27197");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public LocalDate getPaymentDate() { return paymentDate; }
}
