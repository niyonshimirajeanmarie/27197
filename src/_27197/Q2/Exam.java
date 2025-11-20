package _27197.q2;

import java.time.LocalDate;

public class Exam extends Course {
    private String examName;
    private double maxMarks;
    private LocalDate examDate;

    public Exam(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String teacherPhone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, double maxMarks, LocalDate examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);

        if (maxMarks <= 0) throw new SchoolDataException("Max marks must be > 0 27197");
        if (examDate == null) throw new SchoolDataException("Exam date cannot be null 27197");

        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public LocalDate getExamDate() {
        return examDate;
    }
}
