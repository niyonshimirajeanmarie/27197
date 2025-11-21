package _27197;

import _27197.q8.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ8 {
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Library Name:");
            String libName = sc.nextLine();
            if (libName == null || libName.trim().isEmpty()) {
                throw new IllegalArgumentException("Library name cannot be empty");
            }
            
            System.out.println("Location:");
            String location = sc.nextLine();
            if (location == null || location.trim().isEmpty()) {
                throw new IllegalArgumentException("Location cannot be empty");
            }
            
            System.out.println("Phone Number:");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Phone number must be exactly 10 digits");
            }

            System.out.println("Section Name:");
            String sectionName = sc.nextLine();
            if (sectionName == null || sectionName.trim().isEmpty()) {
                throw new IllegalArgumentException("Section name cannot be empty");
            }
            
            System.out.println("Section Code:");
            String sectionCode = sc.nextLine();
            if (sectionCode == null || sectionCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Section code cannot be empty");
            }

            System.out.println("Book Title:");
            String title = sc.nextLine();
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty");
            }
            
            System.out.println("Author:");
            String author = sc.nextLine();
            if (author == null || author.trim().isEmpty()) {
                throw new IllegalArgumentException("Author cannot be empty");
            }
            
            System.out.println("ISBN:");
            String isbn = sc.nextLine();
            if (isbn == null || isbn.trim().isEmpty()) {
                throw new IllegalArgumentException("ISBN cannot be empty");
            }

            System.out.println("Member Name:");
            String memberName = sc.nextLine();
            if (memberName == null || memberName.trim().isEmpty()) {
                throw new IllegalArgumentException("Member name cannot be empty");
            }
            
            System.out.println("Member ID:");
            int memberId = Integer.parseInt(sc.nextLine());
            if (memberId <= 0) {
                throw new IllegalArgumentException("Member ID must be positive");
            }
            
            System.out.println("Member Contact:");
            String contact = sc.nextLine();
            if (!isValidPhone(contact)) {
                throw new IllegalArgumentException("Member contact must be exactly 10 digits");
            }

            System.out.println("Borrow Date (YYYY-MM-DD):");
            LocalDate borrowDate = LocalDate.parse(sc.nextLine());
            if (borrowDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Borrow date cannot be in the future");
            }
            
            System.out.println("Return Date (YYYY-MM-DD):");
            LocalDate returnDate = LocalDate.parse(sc.nextLine());
            if (returnDate.isBefore(borrowDate) || returnDate.equals(borrowDate)) {
                throw new IllegalArgumentException("Return date must be after borrow date");
            }

            System.out.println("Fine Amount:");
            double fineAmount = Double.parseDouble(sc.nextLine());
            if (fineAmount < 0) {
                throw new IllegalArgumentException("Fine amount cannot be negative");
            }
            
            System.out.println("Days Late:");
            int daysLate = Integer.parseInt(sc.nextLine());
            if (daysLate < 0) {
                throw new IllegalArgumentException("Days late cannot be negative");
            }

            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());
            if (paymentDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Payment date cannot be in the future");
            }
            
            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();
            if (paymentMode == null || paymentMode.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment mode cannot be empty");
            }

            System.out.println("Total Fine:");
            double totalFine = Double.parseDouble(sc.nextLine());
            if (totalFine < 0) {
                throw new IllegalArgumentException("Total fine cannot be negative");
            }

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
