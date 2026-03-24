//Subway Surfers 
import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Subway Surfers--");
        System.out.println("1.Jump");
        System.out.println("2.Slide");
        System.out.println("3.Move Left");
        System.out.println("4.Move Right");
        System.out.println("5.Collect Coins");
        System.out.print("Enter your choice(1-5): ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("You Jumped!");
                break;
            case 2:
                System.out.println("You Slided!");
                break;
            case 3:
                System.out.println("You Moved Left!");
                break;
            case 4:
                System.out.println("You Moved Right!");
                break;
            case 5:
                System.out.println("You Collected Coins!");
                break;
            default:
                System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
        }        sc.close();
       
    }
}