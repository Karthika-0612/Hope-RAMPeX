//Leetcode 1295 . Find Numbers with Even Number of Digits using number Crunching

import java.util.Scanner;

public class task3 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            int digit=0;
            if(num==0) digit=1;
            while(num > 0) {
                num=num/10;
                digit++;
            }
            if(digit%2==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findNumbers(nums));
        sc.close();
    }
    
}
