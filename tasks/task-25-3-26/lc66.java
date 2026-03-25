//LeetCode 66 Plus One
import java.util.*;

public class lc66 {
    public static int[] plusOne(int[] nums){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
        }
        int[] res=new int[nums.length+1];
        res[0]=1;
        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(arr)));

        sc.close();
    }

    
}
