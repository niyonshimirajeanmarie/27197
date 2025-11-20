package _27197.q8;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN,
                String memberName, int memberId, String contactNumber,
                java.time.LocalDate borrowDate, java.time.LocalDate returnDate,
                double fineAmount, int daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate);
        if (fineAmount < 0) throw new LibraryDataException("Fine must be ≥ 0 27197");
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    public double getFineAmount() { return fineAmount; }
    public int getDaysLate() { return daysLate; }
}
