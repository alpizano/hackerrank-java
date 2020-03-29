import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

//        < h1 > Nayeem loves counseling</h1 >
//        <h1 ><h1 > Sanjay has no watch</h1 ></h1 ><par > So wait for a while</par >
//        <Amee > safat codes like a ninja</amee >
//        <SA premium>Imtiaz has a secret crush</SA premium>

       // Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());
       // while(testCases>0){
            //String line = in.nextLine();

            //Write your code here
           // line.matches("^>(A-Za-z_0-9)<");

        String s1 = "<h1>Nayeem loves counseling</h1>";
        String s2 = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String s3 = "<Amee>safat codes like a ninja</amee>";
        String s4 = "<SA premium>Imtiaz has a secret crush</SA premium>";

            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
           Matcher m = p.matcher(s1);

            if(m.find()) {
                System.out.println("group(0): " + m.group(0));
                System.out.println("group(1): " + m.group(1));
                System.out.println("group(2): " + m.group(2));

            }

           // testCases--;
        //}
    }
}
