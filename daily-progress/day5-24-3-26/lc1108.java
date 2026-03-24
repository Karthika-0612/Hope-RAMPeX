//LeetCode 1108 Defanging an IP Address
import java.util.*;
public class lc1108 {
    public static String defangIPaddr(String s){
        return s.replace(".","[.]");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(defangIPaddr(s));
        sc.close();
    }
}
