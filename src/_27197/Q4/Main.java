package _27143.Q4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 27143;


        System.out.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine();
        System.out.print("Enter Hotel Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Hotel Phone Number (10 digits): ");
        String phone = sc.nextLine();
        System.out.print("Enter Hotel Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Room Number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter Price per Night (>0): ");
        double price = sc.nextDouble();
        sc.nextLine();


        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter Customer Email: ");
        String customerEmail = sc.nextLine();
        System.out.print("Enter Customer Contact (10 digits): ");
        String customerContact = sc.nextLine();


        LocalDate bookingDate = LocalDate.now();
        System.out.print("Enter Check-In Date (YYYY-MM-DD): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine());
        System.out.print("Enter Check-Out Date (YYYY-MM-DD): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine());


        System.out.print("Enter Service Name: ");
        String serviceName = sc.nextLine();
        System.out.print("Enter Service Cost (>0): ");
        double serviceCost = sc.nextDouble();
        sc.nextLine();


        System.out.print("Enter Payment Method: ");
        String paymentMethod = sc.nextLine();
        LocalDate paymentDate = LocalDate.now();


        System.out.print("Enter Room Charge: ");
        double roomCharge = sc.nextDouble();
        System.out.print("Enter Service Charge: ");
        double serviceCharge = sc.nextDouble();
        sc.nextLine();


        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Comments: ");
        String comments = sc.nextLine();


        ReservationRecord record = new ReservationRecord(
                id, hotelName, address, phone, email,
                roomNumber, roomType, price,
                customerName, customerEmail, customerContact,
                bookingDate, checkIn, checkOut,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments
        );

        System.out.println();
        record.generateReservationReport();
        sc.close();
    }
}
