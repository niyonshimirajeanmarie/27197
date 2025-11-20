package _27197.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String teacherPhone,
                   String studentName, int rollNumber, String grade, String contactNumber) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone);

        if (rollNumber <= 0) throw new SchoolDataException("Roll number must be > 0 27197");
        if (grade.isEmpty()) throw new SchoolDataException("Grade cannot be empty 27197");
        if (!contactNumber.matches("\\d{10}")) throw new SchoolDataException("Contact must be 10 digits 27197");

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
