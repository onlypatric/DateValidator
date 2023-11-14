import java.time.LocalDate;
import java.util.Scanner;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) {
        DateValidator d=null;
        LocalDate date;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Insert a date (dd/mm/yyyy): ");
                d=new DateValidator(sc.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (d==null);
        System.out.println("Date has been validated");
        System.out.println(d);
    }
}