import java.util.*;
public class Arraysy {
    // public static void arr(int[] ar,int n){
    //     for(int i=0;i<n;i++){
    //         System.out.println(ar[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int x=sc.nextInt();
    //     int[] ar=new int[x];
    //     for(int i=0;i<x;i++){
    //         ar[i]=sc.nextInt();
    //     }
    //     arr(ar,x);
    // }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        moveZeroes(ar);
        System.out.println(Arrays.toString(ar));
    }
}

