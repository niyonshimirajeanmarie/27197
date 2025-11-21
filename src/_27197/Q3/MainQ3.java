package _27197;

import _27197.q3.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQ3 {
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
            System.out.println("Enter Company Name:");
            String companyName = sc.nextLine();
            if (companyName == null || companyName.trim().isEmpty()) {
                throw new IllegalArgumentException("Company name cannot be empty");
            }
            
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }
            
            System.out.println("Enter Phone (10 digits):");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Phone must be exactly 10 digits");
            }
            
            System.out.println("Enter Email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format");
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

            System.out.println("Enter Manager Name:");
            String managerName = sc.nextLine();
            if (managerName == null || managerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Manager name cannot be empty");
            }
            
            System.out.println("Enter Manager Email:");
            String managerEmail = sc.nextLine();
            if (!isValidEmail(managerEmail)) {
                throw new IllegalArgumentException("Invalid manager email format");
            }
            
            System.out.println("Enter Manager Phone:");
            String managerPhone = sc.nextLine();
            if (!isValidPhone(managerPhone)) {
                throw new IllegalArgumentException("Manager phone must be exactly 10 digits");
            }

            System.out.println("Enter Employee Name:");
            String empName = sc.nextLine();
            if (empName == null || empName.trim().isEmpty()) {
                throw new IllegalArgumentException("Employee name cannot be empty");
            }
            
            System.out.println("Enter Employee ID:");
            int empId = Integer.parseInt(sc.nextLine());
            if (empId <= 0) {
                throw new IllegalArgumentException("Employee ID must be positive");
            }
            
            System.out.println("Enter Designation:");
            String designation = sc.nextLine();
            if (designation == null || designation.trim().isEmpty()) {
                throw new IllegalArgumentException("Designation cannot be empty");
            }
            
            System.out.println("Enter Employee Contact:");
            String empContact = sc.nextLine();
            if (!isValidPhone(empContact)) {
                throw new IllegalArgumentException("Employee contact must be exactly 10 digits");
            }

            System.out.println("Enter Total Days:");
            int totalDays = Integer.parseInt(sc.nextLine());
            if (totalDays <= 0) {
                throw new IllegalArgumentException("Total days must be positive");
            }
            
            System.out.println("Enter Present Days:");
            int presentDays = Integer.parseInt(sc.nextLine());
            if (presentDays < 0) {
                throw new IllegalArgumentException("Present days cannot be negative");
            }
            
            System.out.println("Enter Leave Days:");
            int leaveDays = Integer.parseInt(sc.nextLine());
            if (leaveDays < 0) {
                throw new IllegalArgumentException("Leave days cannot be negative");
            }
            
            if (presentDays + leaveDays > totalDays) {
                throw new IllegalArgumentException("Present days + leave days cannot exceed total days");
            }

            System.out.println("Enter Housing Allowance:");
            double housing = Double.parseDouble(sc.nextLine());
            if (housing < 0) {
                throw new IllegalArgumentException("Housing allowance cannot be negative");
            }
            
            System.out.println("Enter Transport Allowance:");
            double transport = Double.parseDouble(sc.nextLine());
            if (transport < 0) {
                throw new IllegalArgumentException("Transport allowance cannot be negative");
            }

            System.out.println("Enter Tax Deduction:");
            double tax = Double.parseDouble(sc.nextLine());
            if (tax < 0) {
                throw new IllegalArgumentException("Tax deduction cannot be negative");
            }
            
            System.out.println("Enter Loan Deduction:");
            double loan = Double.parseDouble(sc.nextLine());
            if (loan < 0) {
                throw new IllegalArgumentException("Loan deduction cannot be negative");
            }

            System.out.println("Enter Basic Salary:");
            double basic = Double.parseDouble(sc.nextLine());
            if (basic < 0) {
                throw new IllegalArgumentException("Basic salary cannot be negative");
            }

            PayrollRecord payroll = new PayrollRecord(1, LocalDate.now(), LocalDate.now(),
                    companyName, address, phone, email,
                    deptName, deptCode,
                    managerName, managerEmail, managerPhone,
                    empName, empId, designation, empContact,
                    totalDays, presentDays, leaveDays,
                    housing, transport,
                    tax, loan,
                    basic);

            payroll.displayPayrollRecord();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }

        sc.close();
    }
}
