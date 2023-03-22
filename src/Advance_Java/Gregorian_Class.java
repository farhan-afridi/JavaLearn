package Advance_Java;

import java.sql.SQLOutput;
import java.util.Calendar;
public class Gregorian_Class
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("Date = "+c.get(Calendar.DATE));
        System.out.println("Seconds = "+c.get(Calendar.SECOND));
        System.out.println("Hour = "+c.get(Calendar.HOUR));
        System.out.println("Minute = "+c.get(Calendar.MINUTE));
        System.out.println("Hour in 24 format = "+c.get(Calendar.HOUR_OF_DAY));
    }
}