import java.util.Scanner;
import java.util.regex.Pattern;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    //Pattern.matches(["A-Za-z0-9"]);
    public static final String regularExpression = "^[A-Za-z][A-Za-z_0-9]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}