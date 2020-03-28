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
        Calendar cal = new Calendar.Builder().setDate(year,month,day).build();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        int int_day = calendar.get(Calendar.DAY_OF_WEEK);

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
}

public class Test {
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
