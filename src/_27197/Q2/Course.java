package _27197.q2;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String teacherPhone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber);

        if (creditHours <= 0) throw new SchoolDataException("Credit hours must be > 0 27197");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
