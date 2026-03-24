//Leetcode 557 Reverse Words in  a String III
import java.util.*;
public class lc557 {
    public static String reverseWords(String s){
        String[] a=s.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String i:a){
            sb.append(new StringBuilder(i).reverse().toString()).append(" ");
        }
        return sb.toString().trim();

    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseWords(s));
        sc.close();


    }
    
}
