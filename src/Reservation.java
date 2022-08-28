import java.io.IOException;
import java.util.Scanner;

public class Reservation {
    public static String contry;
    public static String date;

    public static void cancelReservation() throws IOException{
        FIle.deleteData();
    }
    public static void makeReservation() throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country : ");
        contry = scanner.next();

        System.out.print("Enter day :");
        date = scanner.next();

        FIle.writeData();

    }
    public static void checkReservationDate()throws IOException{
        FIle.checkDateData();
    }
    public static void checkReservationCountry()throws IOException{
        FIle.checkCountyData();
    }
}
