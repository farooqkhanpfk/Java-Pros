import java.util.*;
public class Collect {
    public static void main(String[] args){
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        Collections.addAll(A,5,6,7,8,9,3);
        while(!A.isEmpty()){
            int a=Collections.min(A);
            int b=Collections.min(A);
            int c=(a+b)/2;
            A.remove(indexOf(A));
            A.remove(indexOf(B));
        }
        
        
    }
    
}
