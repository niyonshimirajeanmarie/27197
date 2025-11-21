package _27197;

import _27197.q2.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQ2 {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter School Name:");
            String schoolName = sc.nextLine();
            if (schoolName == null || schoolName.trim().isEmpty()) {
                throw new IllegalArgumentException("School name cannot be empty");
            }
            
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }
            
            System.out.println("Enter School Phone (10 digits):");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("School phone must be exactly 10 digits");
            }
            
            System.out.println("Enter School Email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid school email format");
            }

            System.out.println("Enter Department Name:");
            String deptName = sc.nextLine();
            if (deptName == null || deptName.trim().isEmpty()) {
                throw new IllegalArgumentException("Department name cannot be empty");
            }
            
            System.out.println("Enter Department Code:");
            String deptCode = sc.nextLine();
            if (deptCode == null || deptCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Department code cannot be empty");
            }

            System.out.println("Enter Teacher Name:");
            String teacherName = sc.nextLine();
            if (teacherName == null || teacherName.trim().isEmpty()) {
                throw new IllegalArgumentException("Teacher name cannot be empty");
            }
            
            System.out.println("Enter Subject:");
            String subject = sc.nextLine();
            if (subject == null || subject.trim().isEmpty()) {
                throw new IllegalArgumentException("Subject cannot be empty");
            }
            
            System.out.println("Enter Teacher Email:");
            String teacherEmail = sc.nextLine();
            if (!isValidEmail(teacherEmail)) {
                throw new IllegalArgumentException("Invalid teacher email format");
            }
            
            System.out.println("Enter Teacher Phone:");
            String teacherPhone = sc.nextLine();
            if (!isValidPhone(teacherPhone)) {
                throw new IllegalArgumentException("Teacher phone must be exactly 10 digits");
            }

            System.out.println("Enter Student Name:");
            String studentName = sc.nextLine();
            if (studentName == null || studentName.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty");
            }
            
            System.out.println("Enter Roll Number:");
            int rollNumber = Integer.parseInt(sc.nextLine());
            if (rollNumber <= 0) {
                throw new IllegalArgumentException("Roll number must be positive");
            }
            
            System.out.println("Enter Grade:");
            String grade = sc.nextLine();
            if (grade == null || grade.trim().isEmpty()) {
                throw new IllegalArgumentException("Grade cannot be empty");
            }
            
            System.out.println("Enter Student Contact:");
            String contact = sc.nextLine();
            if (!isValidPhone(contact)) {
                throw new IllegalArgumentException("Student contact must be exactly 10 digits");
            }

            System.out.println("Enter Course Name:");
            String courseName = sc.nextLine();
            if (courseName == null || courseName.trim().isEmpty()) {
                throw new IllegalArgumentException("Course name cannot be empty");
            }
            
            System.out.println("Enter Course Code:");
            String courseCode = sc.nextLine();
            if (courseCode == null || courseCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Course code cannot be empty");
            }
            
            System.out.println("Enter Credit Hours:");
            int creditHours = Integer.parseInt(sc.nextLine());
            if (creditHours <= 0) {
                throw new IllegalArgumentException("Credit hours must be positive");
            }

            System.out.println("Enter Exam Name:");
            String examName = sc.nextLine();
            if (examName == null || examName.trim().isEmpty()) {
                throw new IllegalArgumentException("Exam name cannot be empty");
            }
            
            System.out.println("Enter Max Marks:");
            double maxMarks = Double.parseDouble(sc.nextLine());
            if (maxMarks <= 0) {
                throw new IllegalArgumentException("Max marks must be positive");
            }
            
            System.out.println("Enter Exam Date (YYYY-MM-DD):");
            LocalDate examDate = LocalDate.parse(sc.nextLine());
            if (examDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Exam date cannot be in the future");
            }

            System.out.println("Enter Obtained Marks:");
            double obtainedMarks = Double.parseDouble(sc.nextLine());
            if (obtainedMarks < 0) {
                throw new IllegalArgumentException("Obtained marks cannot be negative");
            }
            if (obtainedMarks > maxMarks) {
                throw new IllegalArgumentException("Obtained marks cannot exceed max marks");
            }
            
            System.out.println("Enter Remarks:");
            String remarks = sc.nextLine();
            if (remarks == null || remarks.trim().isEmpty()) {
                throw new IllegalArgumentException("Remarks cannot be empty");
            }

            System.out.println("Enter Tuition Fee:");
            double tuitionFee = Double.parseDouble(sc.nextLine());
            if (tuitionFee < 0) {
                throw new IllegalArgumentException("Tuition fee cannot be negative");
            }
            
            System.out.println("Enter Exam Fee:");
            double examFee = Double.parseDouble(sc.nextLine());
            if (examFee < 0) {
                throw new IllegalArgumentException("Exam fee cannot be negative");
            }

            StudentRecord record = new StudentRecord(1, LocalDate.now(), LocalDate.now(),
                    schoolName, address, phone, email,
                    deptName, deptCode, teacherName, subject, teacherEmail, teacherPhone,
                    studentName, rollNumber, grade, contact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee);

            record.displayStudentRecord();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }

        sc.close();
    }
}
