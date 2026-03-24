//LeetCode 345 Reverse vowels in a string
import  java.util.*;
public class task4 {
    public static String revVow(String s){
        char[] arr=s.toCharArray();
        String vow="aeiouAEIOU";
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r&&vow.indexOf(arr[l])==-1){
                l++;
            }
            while(l<r&&vow.indexOf(arr[r])==-1){
                r--;
            }
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
    
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(revVow(s));
        sc.close();


    }
}
