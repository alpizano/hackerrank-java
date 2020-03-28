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

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

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
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
