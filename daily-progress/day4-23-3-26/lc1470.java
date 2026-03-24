//LeetCode 1470. Shuffle the Array
import java.util.Scanner;
public class lc1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[2*n];
        for(int i=0;i<2*n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=shuffle(nums,n);
        for(int i:result){
            System.out.print(i+" ");
        }
        sc.close();
        
    }   
}
