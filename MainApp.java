import java.time.LocalDate;
import java.util.Scanner;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) {
        Date d=null;
        LocalDate date;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Insert a date (dd/mm/yyyy): ");
                d=new Date(sc.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (d==null);
        System.out.println("Date has been validated");
        System.out.println(d);
    }
}