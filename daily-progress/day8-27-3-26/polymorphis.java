class Animal{
    void sound(){
System.out.println("All animals have different sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog will bark ");
    }
}
class Cat extends Animal{
    void sound(){
        super.sound();
        System.out.println("Cat will make  meow");
    }
}
public class polymorphis{
    public static void main(String[] args){
        Animal animal1=new Cat();
        animal1=new Cat();
        animal1.sound();
        Animal animal2=new Dog();
        animal2.sound();

    }
}   

