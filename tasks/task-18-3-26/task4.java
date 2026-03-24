//LeetCode 2525. Categorize Box According to Criteria
import java.util.Scanner;
public class task4 {
    public static String categorizeBox(int length, int width, int height, int mass) {
        String res="";
        long volume=(long)length*width*height;
        if((volume>=1000000000||length>=10000||width>=10000||height>=10000)&&mass>=100){
            res="Both";

        }else if(mass>=100){
            res="Heavy";

        }else if(volume>=1000000000||length>=10000||width>=10000||height>=10000){
            res="Bulky";
        }else{
            res="Neither";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, height and mass:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
       
        String result=categorizeBox(length, width, height, mass);
        System.out.println("The box is categorized as: " + result);
        sc.close();
    }
} 
