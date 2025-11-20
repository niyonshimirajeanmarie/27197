package _27197;

import _27197.q3.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Company Name:");
            String companyName = sc.nextLine();
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            System.out.println("Enter Phone (10 digits):");
            String phone = sc.nextLine();
            System.out.println("Enter Email:");
            String email = sc.nextLine();

            System.out.println("Enter Department Name:");
            String deptName = sc.nextLine();
            System.out.println("Enter Department Code:");
            String deptCode = sc.nextLine();

            System.out.println("Enter Manager Name:");
            String managerName = sc.nextLine();
            System.out.println("Enter Manager Email:");
            String managerEmail = sc.nextLine();
            System.out.println("Enter Manager Phone:");
            String managerPhone = sc.nextLine();

            System.out.println("Enter Employee Name:");
            String empName = sc.nextLine();
            System.out.println("Enter Employee ID:");
            int empId = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Designation:");
            String designation = sc.nextLine();
            System.out.println("Enter Employee Contact:");
            String empContact = sc.nextLine();

            System.out.println("Enter Total Days:");
            int totalDays = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Present Days:");
            int presentDays = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Leave Days:");
            int leaveDays = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Housing Allowance:");
            double housing = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Transport Allowance:");
            double transport = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Tax Deduction:");
            double tax = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Loan Deduction:");
            double loan = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Basic Salary:");
            double basic = Double.parseDouble(sc.nextLine());

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
