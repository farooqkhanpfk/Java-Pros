import java.util.*;
public class Arrays{
    public static void main(String[] args){
        int r=7,u=2;
        int s=0;int c=0;
        int[] ar={2,8,3,5,7,4,1,2};
        int x=r*u;
        for(int i=0;i<=ar.length-1;i++){
            s+=ar[i];
            if(s>=x)c++;}System.out.println(c);
    }
}