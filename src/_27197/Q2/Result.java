package _27197.q2;

public class Result extends Exam {
    private double obtainedMarks;
    private String remarks;

    public Result(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String teacherPhone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, double maxMarks, java.time.LocalDate examDate,
                  double obtainedMarks, String remarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate);

        if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative 27197");
        if (remarks.isEmpty()) throw new SchoolDataException("Remarks cannot be empty 27197");

        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public double calculateAverageMarks() {
        return (obtainedMarks / getMaxMarks()) * 100;
    }
}
