package _27197;

import _27197.q6.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQ6 {
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
            System.out.println("Bank Name:");
            String bankName = sc.nextLine();
            if (bankName == null || bankName.trim().isEmpty()) {
                throw new IllegalArgumentException("Bank name cannot be empty");
            }
            
            System.out.println("Branch Code:");
            String branchCode = sc.nextLine();
            if (branchCode == null || branchCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Branch code cannot be empty");
            }
            
            System.out.println("Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }

            System.out.println("Account Number:");
            String accountNumber = sc.nextLine();
            if (accountNumber == null || accountNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Account number cannot be empty");
            }
            
            System.out.println("Account Type:");
            String accountType = sc.nextLine();
            if (accountType == null || accountType.trim().isEmpty()) {
                throw new IllegalArgumentException("Account type cannot be empty");
            }
            
            System.out.println("Balance:");
            double balance = Double.parseDouble(sc.nextLine());
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }

            System.out.println("Customer Name:");
            String custName = sc.nextLine();
            if (custName == null || custName.trim().isEmpty()) {
                throw new IllegalArgumentException("Customer name cannot be empty");
            }
            
            System.out.println("Email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format");
            }
            
            System.out.println("Phone Number:");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Phone number must be exactly 10 digits");
            }

            System.out.println("Transaction ID:");
            String transId = sc.nextLine();
            if (transId == null || transId.trim().isEmpty()) {
                throw new IllegalArgumentException("Transaction ID cannot be empty");
            }
            
            System.out.println("Transaction Type:");
            String transType = sc.nextLine();
            if (transType == null || transType.trim().isEmpty()) {
                throw new IllegalArgumentException("Transaction type cannot be empty");
            }
            
            System.out.println("Transaction Amount:");
            double amount = Double.parseDouble(sc.nextLine());
            if (amount < 0) {
                throw new IllegalArgumentException("Transaction amount cannot be negative");
            }

            System.out.println("Deposit Amount:");
            double depAmount = Double.parseDouble(sc.nextLine());
            if (depAmount < 0) {
                throw new IllegalArgumentException("Deposit amount cannot be negative");
            }
            
            System.out.println("Deposit Date (YYYY-MM-DD):");
            LocalDate depDate = LocalDate.parse(sc.nextLine());
            if (depDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Deposit date cannot be in the future");
            }

            System.out.println("Withdrawal Amount:");
            double withAmount = Double.parseDouble(sc.nextLine());
            if (withAmount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            }
            
            System.out.println("Withdrawal Date (YYYY-MM-DD):");
            LocalDate withDate = LocalDate.parse(sc.nextLine());
            if (withDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Withdrawal date cannot be in the future");
            }

            System.out.println("Loan Amount:");
            double loanAmount = Double.parseDouble(sc.nextLine());
            if (loanAmount < 0) {
                throw new IllegalArgumentException("Loan amount cannot be negative");
            }
            
            System.out.println("Interest Rate:");
            double interestRate = Double.parseDouble(sc.nextLine());
            if (interestRate < 0 || interestRate > 100) {
                throw new IllegalArgumentException("Interest rate must be between 0 and 100");
            }
            
            System.out.println("Duration (years):");
            int duration = Integer.parseInt(sc.nextLine());
            if (duration <= 0) {
                throw new IllegalArgumentException("Duration must be positive");
            }

            System.out.println("Payment Amount:");
            double payAmount = Double.parseDouble(sc.nextLine());
            if (payAmount < 0) {
                throw new IllegalArgumentException("Payment amount cannot be negative");
            }
            
            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate payDate = LocalDate.parse(sc.nextLine());
            if (payDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Payment date cannot be in the future");
            }

            AccountRecord record = new AccountRecord(1, LocalDate.now(), LocalDate.now(),
                    bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    custName, email, phone,
                    transId, transType, amount,
                    depAmount, depDate,
                    withAmount, withDate,
                    loanAmount, interestRate, duration,
                    payAmount, payDate);

            record.displayAccount();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }
        sc.close();
    }
}
