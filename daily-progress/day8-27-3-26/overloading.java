public class overloading{
    public static void main(String[] args){
        add obj=new add();
        obj.sum(10,5);
        obj.sum(10,5,10);

    }
}
class add{
    void sum(int a,int b){
        System.out.println("a+b="+ (a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("a+b+c="+ (a+b+c));
    }
}