//Leetcode 1480. Running Sum of 1d Array
import java.util.Scanner;
public class lc1480 {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = runningSum(nums);
        System.out.print("Running sum array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}