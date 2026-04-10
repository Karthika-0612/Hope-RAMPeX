import java.util.*;
public class lc242{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        s=s.toLowerCase();
        t=t.toLowerCase();
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        System.out.print(Arrays.equals(S,T));
        sc.close();
    }
}