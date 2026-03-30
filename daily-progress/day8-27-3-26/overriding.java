class Parent {
    int add(int a, int b) {
        return a + b;
    }
}

class Child extends Parent {
    
    int add(int a, int b) {
        return a + b + 10; 
    }
}

public class overriding {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.add(5, 10)); 
    }
}