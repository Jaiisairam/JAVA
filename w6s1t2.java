import java.util.*;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String temp = str.substring(1, str.length() - 1);

        return temp.contains(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Solution obj = new Solution();

        System.out.println(obj.repeatedSubstringPattern(s));

        sc.close();
    }
}
