import java.util.Scanner;

public class task2 {
    
    public static int compress(char[] chars) {   
        int n = chars.length;
        int i = 0;      
        int write = 0;          
        while (i < n) {
            char current = chars[i];
            int count = 0;
            while (i < n && chars[i] == current) {
                i++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] chars=new char[n];
        for(int i=0;i<n;i++){
            chars[i]=sc.next().charAt(0);
        }   
        int newLength=compress(chars);
        System.out.println("Compressed length: " + newLength);
        sc.close();
    }
}
