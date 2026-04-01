class Encapsulation{
    int a;
    Encapsulation(){
       
    }
    void display(int a){
        System.out.println("Implementation of Encapsulation "+ a);
    }
}
public class encapsulationImplemmentation{
    public static void main(String[] args){
        Encapsulation en=new Encapsulation();
        en.display(5);

    }
}