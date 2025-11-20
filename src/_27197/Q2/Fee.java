package _27197.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String teacherPhone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, double maxMarks, java.time.LocalDate examDate,
               double obtainedMarks, String remarks,
               double tuitionFee, double examFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks);

        if (tuitionFee <= 0 || examFee <= 0)
            throw new SchoolDataException("Fees must be > 0 27197");

        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        calculateTotalFee();
    }

    private void calculateTotalFee() {
        totalFee = tuitionFee + examFee;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void displayFeeDetails() {
        System.out.println("Tuition Fee: $" + tuitionFee + " 27197");
        System.out.println("Exam Fee: $" + examFee + " 27197");
        System.out.println("Total Fee: $" + totalFee + " 27197");
    }
}
