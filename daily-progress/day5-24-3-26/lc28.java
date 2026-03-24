//LeetCode 28 Find the Index of first Occurence in a String
import java.util.Scanner;
public class lc28 {
    public static int strStr(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<=n-m;i++){
            if(s1.substring(i,i+m).equals(s2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(strStr(s1,s2));
        sc.close();
    }
}
