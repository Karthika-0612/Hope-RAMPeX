import java.util.*;
public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(15);
        set.add(10);
        set.tailSet(5);
        set.headSet(5);
        System.out.println(set);
        
    }
    
}