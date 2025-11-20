package _27197.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionCode.length() < 3) throw new LibraryDataException("Section code must be ≥ 3 chars 27197");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
}
