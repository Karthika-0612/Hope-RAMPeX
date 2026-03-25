class dConstruct{
    dConstruct(){
        System.out.println("I am inside default Constructor");
    }


    dConstruct(int x){
       
        System.out.println("I am inside parameterized Constructor");
        System.out.println(x);

    }
}
public class defaultConstructor{
   
    public static void main(String[] args) {
        System.out.println("see your default constructor");
        dConstruct dc=new dConstruct(10);
        dConstruct ac=new dConstruct();
        System.out.println(dc);
        System.out.println(ac);
        
       

    }
}