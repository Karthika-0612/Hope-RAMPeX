import java.util.Scanner;
public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade: A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade: B");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade: C");
        }
        else if(marks>=60 && marks<70){
            System.out.println("Grade: D");
        }
        else if(marks>=0 && marks<60){
            System.out.println("Grade: F");
        }
        else{
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
        }
        sc.close();
    }
}
