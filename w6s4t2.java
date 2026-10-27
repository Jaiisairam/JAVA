import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.next();
        String needle = sc.next();

        System.out.println(haystack.indexOf(needle));

        sc.close();
    }
}
