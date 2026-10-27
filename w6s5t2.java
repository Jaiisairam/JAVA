
import java.util.Scanner;

public class Solution {

    public static int longestPalindrome(String s) {
        int maxLen = 1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Odd-length palindromes
            int left = i;
            int right = i;

            while (left >= 0 && right < n
                    && s.charAt(left) == s.charAt(right)) {
                maxLen = Math.max(maxLen, right - left + 1);
                left--;
                right++;
            }

            // Even-length palindromes
            left = i;
            right = i + 1;

            while (left >= 0 && right < n
                    && s.charAt(left) == s.charAt(right)) {
                maxLen = Math.max(maxLen, right - left + 1);
                left--;
                right++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int k = 0; k < n; k++) {
            String rotated = s.substring(k) + s.substring(0, k);
            System.out.println(longestPalindrome(rotated));
        }

        sc.close();
    }
}
