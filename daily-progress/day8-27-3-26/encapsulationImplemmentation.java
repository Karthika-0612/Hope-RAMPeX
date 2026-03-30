class Encapsulation{
    int a;
    Encapsulation(){
        this.a=a;
    }
    void display(){
        System.out.println("Implementation of Encapsulation "+a);
    }
}
public class encapsulationImplemmentation{
    public static void main(String[] args){
        Encapsulation en=new Encapsulation();
        en.display();

    }
}