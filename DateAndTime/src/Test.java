import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Test {

    public static String findDay(int month, int day, int year) {
        Calendar cal = new Calendar.Builder().setDate(year,month,day).build();
        //System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //System.out.println(cal);

       Calendar calendar = Calendar.getInstance();

        //calendar.set(year,month,day);
        calendar.set(2015,8,5);

//        calendar.set(Calendar.MONTH, month);
//        calendar.set(Calendar.DATE, day);
//        calendar.set(Calendar.YEAR, year);

        System.out.println(calendar.toString());
        int int_day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("the day returned is" + int_day);
        String str_day = "";
        if(int_day == 1) {
            str_day = "Sunday";
        }
        else if(int_day == 2) {
            str_day = "Monday";
        }
        else if(int_day == 3) {
            str_day = "Tuesday";
        }
        else if(int_day == 4) {
            str_day = "Wednesday";
        }
        else if(int_day == 5) {
            str_day = "Thursday";
        }
        else if(int_day == 6) {
            str_day = "Friday";
        }
        else {
            str_day = "Saturday";
        }
        return str_day;
        }

        public static void main(String[] args) {
            //Test.findDay(8,5,2015);
            System.out.println(Test.findDay(8,5,2015));

        }
}
