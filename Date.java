import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date {

    private int year, month, day;
    private LocalDate localDate;
    private static final String DATE_REGEXP = "^(3[01]|[12][0-9]|0?[1-9])(\\/|-|\\.|,|:)(1[0-2]|0?[1-9])\\2([0-9]{2})?[0-9]{2}$";
    // regex semplificato: [1-31]/[1-12]/([0-9]{2}|[0-9]{4})
    private static final char[] DATE_SEP_CHARS = new char[] { '-', '.', ',', ':' };

    public static boolean isValid(String date) {

        return date.matches(DATE_REGEXP);
    }

    public static String adaptDate(String date) throws Exception {
        if (!isValid(date)) {
            throw new Exception("Date is not valid");
        }
        for (char c : DATE_SEP_CHARS) {
            if (date.contains(Character.toString(c))) {
                date = date.replace(c, '/');
            }
        }
        return date;
    }

    public Date(String date) throws Exception {
        date = adaptDate(date);
        String[] splittedDate = date.split("\\/");
        this.year = Integer.parseInt(splittedDate[2]);
        this.month = Integer.parseInt(splittedDate[1]);
        this.day = Integer.parseInt(splittedDate[0]);
        if (this.day > 29 && this.month == 2) {
            throw new Exception("This date cannot exist");
        }
        if (this.day == 29 && this.month == 2 && (!(this.year % 4 == 0 && !(this.year % 100 == 0))))
            throw new Exception("This date cannot exist");
        localDate = LocalDate.of(year, month, day);

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        String monthName = switch (localDate.getMonth()) {
            case JANUARY -> "Gennaio";
            case FEBRUARY -> "Febbraio";
            case MARCH -> "Marzo";
            case APRIL -> "Aprile";
            case MAY -> "Maggio";
            case JUNE -> "Giugno";
            case JULY -> "Luglio";
            case AUGUST -> "Agosto";
            case SEPTEMBER -> "Settembre";
            case OCTOBER -> "Ottobre";
            case NOVEMBER -> "Novembre";
            case DECEMBER -> "Dicembre";
        };
        return String.format("%s %d %s %d", localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY), day,
                monthName, year);
    }
}