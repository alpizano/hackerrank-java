import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-15s",s1);
            if(x < 100) {
                System.out.printf("%03d",x);
            }
            else{
                System.out.printf("%d",x);

            }
        }
        System.out.println("================================");
    }
}
