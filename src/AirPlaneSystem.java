import java.util.Scanner;

public class AirPlaneSystem {
    Scanner scanner = new Scanner(System.in);

    private void systemMenu() {
        System.out.println("Do you want to reserve a ticket ? == enter (1)");
        System.out.println("Do you want to cancel your ticket ? == enter (2)");
        System.out.println("Check the time of your tickets == enter (3)");
        System.out.println("where is your ticket ? == enter (4)");
    }

    private void selectSystemMenu() throws Exception {
        boolean b = true;
        while (b) {
            String num = scanner.nextLine();
            if (num.equals("1")) {
                Reservation.makeReservation();
                b = false;
            } else if (num.equals("2")) {
                Reservation.cancelReservation();
                b = false;
            } else if (num.equals("3")) {
                Reservation.checkReservationDate();
                b = false;
            } else if (num.equals("4")) {
                Reservation.checkReservationCountry();
                b = false;
            } else {
                System.out.println("Please select correct number !");
            }
        }
    }

    public void startingSystem() throws Exception {
        System.out.println("Welcome to airplane system ");
        systemMenu();
        selectSystemMenu();
    }
}

