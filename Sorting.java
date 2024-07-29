import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=arr.length;
        // //Bubble Sort
        // for(int i=0;i<x-1;i++){
        //     for(int j=0;j<x-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // } for (int i = 0; i < x; i++) {
        //     System.out.print(arr[i] + " ");
        // }


        //// Selection 
        // for(int i=0;i<x-1;i++){
        //     int s=i;
        //     for(int j=i+1;j<x;j++){
        //         if(arr[s]>arr[j]){
        //             s=j;
        //         }
        //     }
        //     int t=arr[s];
        //     arr[s]=arr[i];
        //     arr[i]=t;
        // }
        // for(int i=0;i<x;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //Insertion Sort

        for(int i=0;i<x;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;        
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
