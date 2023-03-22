package Advance_Java;

import java.util.Date;

public class Date_Class
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println (d);
        System.out.println(d.getTime());        //prints milli seconds till date
        System.out.println(d.getYear()+1900);   //getYear() prints year subtracting 1900 from current year
        System.out.println(d.getDate());

        Date d1 = new Date(2021,5,23);
        System.out.println (d1.compareTo(d));                   //to compare two dates
        System.out.println(d1.getTime());       //total milli seconds till the specified date
    }
}