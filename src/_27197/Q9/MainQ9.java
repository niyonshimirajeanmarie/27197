package _27197;

import _27197.q9.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Airline Name:");
            String airlineName = sc.nextLine();
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Contact Email:");
            String email = sc.nextLine();

            System.out.println("Flight Number:");
            String flightNumber = sc.nextLine();
            System.out.println("Destination:");
            String destination = sc.nextLine();
            System.out.println("Departure DateTime (YYYY-MM-DDTHH:MM):");
            LocalDateTime departure = LocalDateTime.parse(sc.nextLine());

            System.out.println("Passenger Name:");
            String passengerName = sc.nextLine();
            System.out.println("Passport Number:");
            String passport = sc.nextLine();
            System.out.println("Nationality:");
            String nationality = sc.nextLine();

            System.out.println("Seat Number:");
            String seatNumber = sc.nextLine();
            System.out.println("Seat Type (Economy/Business):");
            String seatType = sc.nextLine();

            System.out.println("Ticket Number:");
            String ticketNumber = sc.nextLine();
            System.out.println("Ticket Price:");
            double price = Double.parseDouble(sc.nextLine());

            System.out.println("Baggage Weight:");
            double baggageWeight = Double.parseDouble(sc.nextLine());
            System.out.println("Baggage Fee:");
            double baggageFee = Double.parseDouble(sc.nextLine());

            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());
            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();

            System.out.println("Total Fare:");
            double totalFare = Double.parseDouble(sc.nextLine());

            TicketRecord record = new TicketRecord(1, LocalDate.now(), LocalDate.now(),
                    airlineName, address, email,
                    flightNumber, destination, departure,
                    passengerName, passport, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode,
                    totalFare);

            record.displayInvoice();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }
        sc.close();
    }
}
