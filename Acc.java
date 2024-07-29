import java.util.*;
public class Acc{
    public static void main(String[] args) {
        int a[]={0,1,2,3,4};
        int b[]={0,1,2,2,1};
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(b[i],a[i]);
        }System.out.println(l);
    }
}