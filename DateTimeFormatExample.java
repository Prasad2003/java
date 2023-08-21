import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDate = new Date();

        // Define date and time formats
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat dateFormat4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat weekOfYearFormat = new SimpleDateFormat("ww");
        SimpleDateFormat weekOfMonthFormat = new SimpleDateFormat("W");
        SimpleDateFormat dayOfYearFormat = new SimpleDateFormat("D");

        // Format and display the current date and time in various ways
        System.out.println("Current date is : " + dateFormat1.format(currentDate));
        System.out.println("Current date is : " + dateFormat2.format(currentDate));
        System.out.println("Current date is : " + dateFormat3.format(currentDate));
        System.out.println("Current date and time is : " + dateFormat4.format(currentDate));
        System.out.println("Current date and time is : " + dateFormat5.format(currentDate));
        System.out.println("Current time is : " + timeFormat.format(currentDate));
        System.out.println("Current week of year is : " + weekOfYearFormat.format(currentDate));
        System.out.println("Current week of month : " + weekOfMonthFormat.format(currentDate));
        System.out.println("Current day of the year is : " + dayOfYearFormat.format(currentDate));
    }
}
