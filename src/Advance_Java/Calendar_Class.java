package Advance_Java;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

// calendar class is an abstract class, but we can create an instance using static method 'getinstance()'
public class Calendar_Class
{
    public static void main(String[] args)
    {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    // setting custom time zone  (niche)

//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());
    }
}
