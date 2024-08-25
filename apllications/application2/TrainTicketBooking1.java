package com.evergent.corejava1.bhargav.application2;

import java.util.Scanner;
import java.io.IOException;

public class TrainTicketBooking1 {
	enum Module1 {
        B, P, R, C, CB, E
    }
    enum SubmoduleBooking {
        S, F
    }
    enum SubmodulePayment {
        T, P
    }
    enum SubmoduleReport {
        I, S
    }
    enum SubmoduleCancellation {
        C
    }
    enum SubmoduleChangeBooking {
        CB
    }
    
    static int ticketCost;
    static int totalAmount;
    static int numberOfTickets;
    static int discountedAmount;
    static int additionalCost;

    public static void main(String[] args) throws IOException {
        String module = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\tWelcome To Train Ticket Booking System");

        while (true) {
            System.out.println("======================");
            System.out.println("Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("C - Cancellation Module");
            System.out.println("CB - Change Booking Module");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your Module code (B,P,R,C,CB,E): ");

            module = scanner.nextLine().toUpperCase();

            switch (Module1.valueOf(module)) {
                case B:
                    System.out.println("Booking Module");
                    System.out.println("======================");
                    System.out.println("S - Book Standard Class");
                    System.out.println("F - Book First Class");
                    System.out.println("======================");
                    System.out.print("Enter your Booking Class code (S,F): ");

                    module = scanner.nextLine().toUpperCase();

                    switch (SubmoduleBooking.valueOf(module)) {
                        case S:
                            ticketCost = 50;
                            break;
                        case F:
                            ticketCost = 100;
                            break;
                    }

                    System.out.print("Enter the number of tickets: ");

                    numberOfTickets = Integer.parseInt(scanner.nextLine());

                    totalAmount = ticketCost * numberOfTickets;
                    System.out.println("Amount for tickets before discount is " + totalAmount);

                    if (numberOfTickets <= 5) {
                        discountedAmount = totalAmount;
                    } else if (numberOfTickets <= 10) {
                        discountedAmount = (int) (totalAmount * 0.90);
                    } else {
                        discountedAmount = (int) (totalAmount * 0.85);
                    }

                    System.out.println("Amount for tickets after discount is " + discountedAmount);
                    break;

                case P:
                    System.out.println("Payment Module");
                    System.out.println("======================");
                    System.out.println("T - Display total amount to be paid");
                    System.out.println("P - Make payment");
                    System.out.println("======================");
                    System.out.print("Enter your Payment Action code (T,P): ");

                    module = scanner.nextLine().toUpperCase();

                    switch (SubmodulePayment.valueOf(module)) {
                        case T:
                            System.out.println("Total Amount to be Paid: " + discountedAmount);
                            break;
                        case P:
                            System.out.println("Payment of " + discountedAmount + " processed.");
                            break;
                    }
                    break;

                case R:
                    System.out.println("Report Module");
                    System.out.println("======================");
                    System.out.println("I - Display invoice for booking");
                    System.out.println("S - Display booking summary");
                    System.out.println("======================");
                    System.out.print("Enter your Report Action code (I,S): ");

                    module = scanner.nextLine().toUpperCase();

                    switch (SubmoduleReport.valueOf(module)) {
                        case I:
                            System.out.println("Invoice Display");
                            System.out.println("==================");
                            System.out.println("Booking ID: " + (Math.ceil(Math.random())));
                            System.out.println("Number of tickets: " + numberOfTickets);
                            System.out.println("Amount to Pay: " + discountedAmount);
                            break;

                        case S:
                            System.out.println("Booking Summary");
                            System.out.println("======================");
                            System.out.println("Ticket Cost: " + ticketCost);
                            System.out.println("Number of tickets: " + numberOfTickets);
                            System.out.println("Amount before Discount: " + totalAmount);
                            System.out.println("Amount after Discount: " + discountedAmount);
                            break;
                    }
                    break;

                case C:
                    System.out.println("Cancellation Module");
                    System.out.println("======================");
                    System.out.println("C - Cancel Booking");
                    System.out.println("======================");
                    System.out.print("Enter your Cancellation Action code (C): ");

                    module = scanner.nextLine().toUpperCase();

                    switch (SubmoduleCancellation.valueOf(module)) {
                        case C:
                            numberOfTickets = 0;
                            discountedAmount = 0;
                            System.out.println("Booking has been cancelled.");
                            break;
                    }
                    break;

                case CB:
                    System.out.println("Change Booking Module");
                    System.out.println("======================");
                    System.out.println("CB - Change Booking Details");
                    System.out.println("======================");
                    System.out.print("Enter your Change Booking Action code (CB): ");

                    module = scanner.nextLine().toUpperCase();

                    switch (SubmoduleChangeBooking.valueOf(module)) {
                        case CB:
                            System.out.print("Enter the new number of tickets: ");
                            numberOfTickets = Integer.parseInt(scanner.nextLine());
                            
                            totalAmount = ticketCost * numberOfTickets;
                            System.out.println("Amount for tickets before discount is " + totalAmount);

                            if (numberOfTickets <= 5) {
                                discountedAmount = totalAmount;
                            } else if (numberOfTickets <= 10) {
                                discountedAmount = (int) (totalAmount * 0.90);
                            } else {
                                discountedAmount = (int) (totalAmount * 0.85);
                            }

                            System.out.println("Amount for tickets after discount is " + discountedAmount);
                            break;
                    }
                    break;

                case E:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
