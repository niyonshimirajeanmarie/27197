package _27197.q2;

import java.util.regex.Pattern;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);

        if (subject.isEmpty()) throw new SchoolDataException("Subject cannot be empty 27197");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", teacherEmail))
            throw new SchoolDataException("Invalid email 27197");
        if (!phone.matches("\\d{10}")) throw new SchoolDataException("Phone must be 10 digits 27197");

        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }
}
