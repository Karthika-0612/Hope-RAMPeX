//Leetcode 344. Reverse String
import java.util.*;
public class lc344 {
    public  static void reverseString(char[] a) {
        int l=0,r=a.length-1;
        while(l<r){
            char temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] a = str.toCharArray();
        reverseString(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    
    
}
