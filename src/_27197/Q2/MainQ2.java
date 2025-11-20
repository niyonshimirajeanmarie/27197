package _27197;

import _27197.q2.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter School Name:");
            String schoolName = sc.nextLine();
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            System.out.println("Enter School Phone (10 digits):");
            String phone = sc.nextLine();
            System.out.println("Enter School Email:");
            String email = sc.nextLine();

            System.out.println("Enter Department Name:");
            String deptName = sc.nextLine();
            System.out.println("Enter Department Code:");
            String deptCode = sc.nextLine();

            System.out.println("Enter Teacher Name:");
            String teacherName = sc.nextLine();
            System.out.println("Enter Subject:");
            String subject = sc.nextLine();
            System.out.println("Enter Teacher Email:");
            String teacherEmail = sc.nextLine();
            System.out.println("Enter Teacher Phone:");
            String teacherPhone = sc.nextLine();

            System.out.println("Enter Student Name:");
            String studentName = sc.nextLine();
            System.out.println("Enter Roll Number:");
            int rollNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Grade:");
            String grade = sc.nextLine();
            System.out.println("Enter Student Contact:");
            String contact = sc.nextLine();

            System.out.println("Enter Course Name:");
            String courseName = sc.nextLine();
            System.out.println("Enter Course Code:");
            String courseCode = sc.nextLine();
            System.out.println("Enter Credit Hours:");
            int creditHours = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Exam Name:");
            String examName = sc.nextLine();
            System.out.println("Enter Max Marks:");
            double maxMarks = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Exam Date (YYYY-MM-DD):");
            LocalDate examDate = LocalDate.parse(sc.nextLine());

            System.out.println("Enter Obtained Marks:");
            double obtainedMarks = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Remarks:");
            String remarks = sc.nextLine();

            System.out.println("Enter Tuition Fee:");
            double tuitionFee = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Exam Fee:");
            double examFee = Double.parseDouble(sc.nextLine());

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
