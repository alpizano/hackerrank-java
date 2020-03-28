interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

//Write your code here
class MyCalculator implements AdvancedArithmetic {
       public int divisor_sum(int n) {
            int divisor = 1;
            int sum = 0;

            while(divisor <= n) {
                if (n % divisor == 0) {
                    sum = sum + divisor;
                }
                divisor++;
            }

            return sum;
        }
    }

    class Test {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.divisor_sum(6));
    }
    }



