interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
	public void show(){
	System.out.println("Welcome to show");
}
public void display(){
    System.out.println("Sam figured out the error\nThe program is running successfully");
}
}
public class interfaceExample {
    public static void main(String[] args) {
        A a = new C();
        a.show();
        B b=new C();
        b.display();
    }
}