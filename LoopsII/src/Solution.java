import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int kSum = 0;
            for (int k = 0; k < n; k++) {
                kSum = kSum + (int) (Math.pow(2, k) * b);
                System.out.printf("%d ", a + kSum);
            }

        }
        in.close();
    }
}