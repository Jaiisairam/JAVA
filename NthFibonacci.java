import java.util.Scanner;

interface Fibonacci {
    int find(int n);
}

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        Fibonacci fib = (num) -> {
            if (num == 0)
                return 0;
            if (num == 1)
                return 1;

            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };

        System.out.println("The " + n + "th Fibonacci number is: " + fib.find(n));

        sc.close();
    }
}