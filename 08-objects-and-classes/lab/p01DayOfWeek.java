import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p01DayOfWeek {
    public static void main(String[] args) throws ParseException {
        //Calendar.DAY_OF_WEEK starts with Sunday, so we initialize our array starting with Sunday
        String[] dayNames = new String[]
                {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //DateFormat formats and parses dates
        DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");

        Date date = dateFormat.parse(input);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int day = calendar.get(Calendar.DAY_OF_WEEK); //day of week returns the day number (first day is sunday)
        System.out.println(dayNames[day - 1]);
    }
}
