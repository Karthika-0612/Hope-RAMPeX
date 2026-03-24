//Leetcode 1523. Count Odd Numbers in an Interval Range
import java.util.Scanner;
public class task3 {
    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low and high:");
        int low = sc.nextInt();
        int high = sc.nextInt();
        int result = countOdds(low, high);
        System.out.println("Number of odd numbers between " + low + " and " + high + " is: " + result);
        sc.close();

    }
}

