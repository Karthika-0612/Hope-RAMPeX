//LeetCode 168 Excel Sheet Column Title
import java.util.*;
public class task1 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            res.append((char)(rem+'A'));
            columnNumber/=26;

        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(convertToTitle(n));
        sc.close();
    }
}
