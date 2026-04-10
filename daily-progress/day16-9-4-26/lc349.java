//LeetCode 349. Intersection of Two Arrays
import java.util.*;
public class lc349 {    
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }  
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    } 

}