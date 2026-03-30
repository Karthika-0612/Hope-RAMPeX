abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
	void sound(){
	System.out.println("Barks...");
    }
}
class Cat  extends  Dog{
    void sound(){

        System.out.println("Meows...");
    }
}
public class abstraction {
    public static void main(String[] args) {
    Animal a = new Dog();
    a.eat();
    a.sound();
}
}