public class constructorOverloading {
    public static void main(String[] args) {
        System.out.println("Constructor Overloading Examples");
        new crOverloading(5);
        new crOverloading("HOPE-BATCH 1");
    }
}
class crOverloading{
    crOverloading(){
        System.out.println("default constructor");

    }
    crOverloading(int i){
        System.out.println("Parameterized constructor and overloading and the value of a:"+i);
    

    }
     crOverloading(String i){
        System.out.println("Parameterized constructor and overloading and the value of s:"+i);

    }
}
