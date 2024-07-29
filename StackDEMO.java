import java.util.*;
public class StackDEMO{
    public static void main(String[] args) {
        // Stack <Integer> s=new Stack<>();
        // s.push(10);
        // s.push(24);
        // s.push(15);
        // s.push(9);
        // System.out.println("Elements in Stack are:"+s);
        // System.out.println("Top element in Stack is:"+s.peek());
        // System.out.println("Removing an element:"+s.pop());
        // System.out.println(s.isEmpty());
        // System.out.println(s.search(10));
        Stack <Integer> l=new Stack<>();
        Collections.addAll(l,1,2,3,6,4,5,7,8,9,12,34,65);
        System.out.println(l);
        System.out.println(l.contains(6));


    }
}