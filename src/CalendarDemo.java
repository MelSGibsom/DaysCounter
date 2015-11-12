// Demonstrate Calendar
import sun.util.resources.cldr.ru.CalendarData_ru_RU;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

class CalendarDemo {
    public static void main(String args[]) {
       /* String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};*/

       /* // Create a calendar initialized with the
        // current date and time in the default
        // locale and timezone.
        Calendar calendar = Calendar.getInstance();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE)+"   " );
       // System.out.print("(" + calendar.get(Calendar.DAY_OF_MONTH) + ")");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.print("Time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

        // Set the time and date information and display it.
       *//* calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);*//*
       // calendar.set(2015,10,30);*/
        Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.YEAR,2015);
        // calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        int Data1;
        int Data2;
        int NumOfDays;
        calendar.set(2015, Calendar.MAY, 30);
        //System.out.print(calendar.get(Calendar.DATE) + " ");
        //System.out.print(calendar.get(Calendar.MONTH) + " ");
        //System.out.println(calendar.get(Calendar.YEAR));
        // System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        Data2 =calendar.get(Calendar.DAY_OF_YEAR);
        calendar.set(2015,Calendar.NOVEMBER,4);
        Data1 = calendar.get(Calendar.DAY_OF_YEAR);
        NumOfDays = Data1 - Data2;
        System.out.println("Прошло "+NumOfDays+ " дней");
        //System.out.print(months[calendar.get(Calendar.OCTOBER)]);
        //System.out.print(" " + calendar.get(Calendar.DATE)+"   " );
        ;       // System.out.println(Calendar.DAY_OF_YEAR);

        /*System.out.print("Updated time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));*/
    }
}
