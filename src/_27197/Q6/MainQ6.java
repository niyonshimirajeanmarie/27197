package _27197;

import _27197.q6.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Bank Name:");
            String bankName = sc.nextLine();
            System.out.println("Branch Code:");
            String branchCode = sc.nextLine();
            System.out.println("Address:");
            String address = sc.nextLine();

            System.out.println("Account Number:");
            String accountNumber = sc.nextLine();
            System.out.println("Account Type:");
            String accountType = sc.nextLine();
            System.out.println("Balance:");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.println("Customer Name:");
            String custName = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Phone Number:");
            String phone = sc.nextLine();

            System.out.println("Transaction ID:");
            String transId = sc.nextLine();
            System.out.println("Transaction Type:");
            String transType = sc.nextLine();
            System.out.println("Transaction Amount:");
            double amount = Double.parseDouble(sc.nextLine());

            System.out.println("Deposit Amount:");
            double depAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Deposit Date (YYYY-MM-DD):");
            LocalDate depDate = LocalDate.parse(sc.nextLine());

            System.out.println("Withdrawal Amount:");
            double withAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Withdrawal Date (YYYY-MM-DD):");
            LocalDate withDate = LocalDate.parse(sc.nextLine());

            System.out.println("Loan Amount:");
            double loanAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Interest Rate:");
            double interestRate = Double.parseDouble(sc.nextLine());
            System.out.println("Duration (years):");
            int duration = Integer.parseInt(sc.nextLine());

            System.out.println("Payment Amount:");
            double payAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate payDate = LocalDate.parse(sc.nextLine());

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
