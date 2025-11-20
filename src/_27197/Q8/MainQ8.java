package _27197;

import _27197.q8.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Library Name:");
            String libName = sc.nextLine();
            System.out.println("Location:");
            String location = sc.nextLine();
            System.out.println("Phone Number:");
            String phone = sc.nextLine();

            System.out.println("Section Name:");
            String sectionName = sc.nextLine();
            System.out.println("Section Code:");
            String sectionCode = sc.nextLine();

            System.out.println("Book Title:");
            String title = sc.nextLine();
            System.out.println("Author:");
            String author = sc.nextLine();
            System.out.println("ISBN:");
            String isbn = sc.nextLine();

            System.out.println("Member Name:");
            String memberName = sc.nextLine();
            System.out.println("Member ID:");
            int memberId = Integer.parseInt(sc.nextLine());
            System.out.println("Member Contact:");
            String contact = sc.nextLine();

            System.out.println("Borrow Date (YYYY-MM-DD):");
            LocalDate borrowDate = LocalDate.parse(sc.nextLine());
            System.out.println("Return Date (YYYY-MM-DD):");
            LocalDate returnDate = LocalDate.parse(sc.nextLine());

            System.out.println("Fine Amount:");
            double fineAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Days Late:");
            int daysLate = Integer.parseInt(sc.nextLine());

            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());
            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();

            System.out.println("Total Fine:");
            double totalFine = Double.parseDouble(sc.nextLine());

            LibraryRecord record = new LibraryRecord(1, LocalDate.now(), LocalDate.now(),
                    libName, location, phone,
                    sectionName, sectionCode,
                    title, author, isbn,
                    memberName, memberId, contact,
                    borrowDate, returnDate,
                    fineAmount, daysLate,
                    paymentDate, paymentMode,
                    totalFine);

            record.displayRecord();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }
        sc.close();
    }
}
