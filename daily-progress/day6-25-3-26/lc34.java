//LeetCode 34 Find first and last position of element in a sorted array
import java.util.*;

public class lc34{
    public static int[] searchrange(int[] nums,int target){
        int[] res=new int[]{-1,-1};
    
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                int j=i;
                while(j<nums.length&&nums[j]==target){
                    j++;
                }
                
                res[1]=j-1;
                break;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int[] nums=new int[n]; 
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();       
        }
        System.out.println(Arrays.toString(searchrange(nums,target)));
        sc.close();
        
    }

}