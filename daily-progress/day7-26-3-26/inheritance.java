class Animal{
    void display(){
        System.out.println("There are multiple animals  choose many of same hierarchy  and mention its sound");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weeps(){
        System.out.println("Puppy whines");
    }
}
public class inheritance{
    public static void main(String[] args){
        Puppy sound=new Puppy();
        sound.barks();
        sound.display();
        sound.weeps();
        System.out.println(sound.hashCode());

    }
}