import java.io.*;

public class FIle {

    public static void writeData() throws IOException {
        FileWriter fw = new FileWriter("System Data");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("County:" + Reservation.contry + " Date:" + Reservation.date);
        bw.close();
    }

    public static void deleteData() throws IOException {
        File deleteData = new File("System Data");
        boolean delete = deleteData.delete(); //?
    }

    public static void checkDateData() throws IOException {
        FileReader fw = new FileReader("System Data");
        BufferedReader bw = new BufferedReader(fw);
        String s = bw.readLine();
        String[] split = s.split(" ");
        System.out.println(split[1]);
    }

    public static void checkCountyData() throws IOException {
        FileReader fw = new FileReader("System Data");
        BufferedReader bw = new BufferedReader(fw);
        String s = bw.readLine();
        String[] split = s.split(" ");
        System.out.println(split[0]);
    }
}
