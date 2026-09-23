import java.util.Scanner;

interface DigitSum {
    int calculate(int n);
}

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        DigitSum evenSum = (n) -> {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                n /= 10;
            }
            return sum;
        };

        System.out.println("Sum of even digits = " + evenSum.calculate(num));

        sc.close();
    }
}