//Leetcode 2864 . Maximum Odd Binary Number
import java.util.Scanner;
public class task5 {
    public static String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        int zeros = s.length() - ones;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < zeros; i++) {
            result.append('0');
        }
        result.append('1');

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary string:");
        String s = sc.nextLine();
        System.out.println(maximumOddBinaryNumber(s));
        sc.close();
    }
}