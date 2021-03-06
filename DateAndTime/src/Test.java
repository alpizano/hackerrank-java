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
        Calendar my_cal = Calendar.getInstance();

        my_cal.set(year,month-1,day); // monday

        int int_day = my_cal.get(Calendar.DAY_OF_WEEK);

        String str_day = "";

        if(int_day == 1) {
            str_day = "SUNDAY";
        }
        else if(int_day == 2) {
            str_day = "MONDAY";
        }
        else if(int_day == 3) {
            str_day = "TUESDAY";
        }
        else if(int_day == 4) {
            str_day = "WEDNESDAY";
        }
        else if(int_day == 5) {
            str_day = "THURSDAY";
        }
        else if(int_day == 6) {
            str_day = "FRIDAY";
        }
        else {
            str_day = "SATURDAY";
        }
        return str_day;
        }

        public static void main(String[] args) {

            System.out.println(Test.findDay(8,5,2015));

        }
}
