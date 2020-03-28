import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Double num = 12324.134;
        Locale indiaLocale = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(num);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(num);
        String in = NumberFormat.getCurrencyInstance(indiaLocale).format(num);
        String ci = NumberFormat.getCurrencyInstance(Locale.CHINA).format(num);

        System.out.println(us);
        System.out.println(fr);
        System.out.println(in);
        System.out.println(ci);


    }
}
