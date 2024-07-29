import java.util.*;
public class ReverseaNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int num=12345;
        // int rev=0;
        // while(num!=0){
        //     int rem=num%10;
        //     rev=rev*10+rem;
        //     num=num/10;
        // }
        // System.out.println(rev);




        ////Swaping of two numbers
        // int a=10;
        // int b=20;
        // System.out.println("Before Swaping");
        // System.out.println("a= "+a);
        // System.out.println("b= "+b);
        ////With temp
        // int t=a;
        // a=b;
        // b=t;
        //Without temp
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("After Swaping");
        // System.out.println("a= "+a);
        // System.out.println("b= "+b);



        // //Reverse a string
        // String s="Farooq";
        // String t="";
        // for(int i=s.length()-1;i>=0;i--){
        //     t+=s.charAt(i);
            
        // }System.out.println(t);


        // //fibnoci series
        // int n=sc.nextInt();
        // int a=0,b=1;
        // if(n==1){
        //     System.out.println(a);
        //     System.exit(0);
        // }else if(n==2){
        //     System.out.println(a+" "+b);
        //     System.exit(0);
        // }else{
        //     System.out.print(a+" "+b);
        //     for(int i=3;i<=n;i++){
        //         int t=a+b;
        //         a=b; 
        //         b=t; 
        //         System.out.print(" "+t);
        //     }
        //     System.out.println();
        // }

        // //Palindrome or not

        // int n=sc.nextInt();
        // int r=0,x=n;
        // while(n!=0){
        //     int rem=n%10;
        //     r=r*10+rem;
        //     n=n/10;
        // }if(r==x){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not a Palindrome");
        // }


        // // Palindrome of String
        // String s=sc.nextLine();
        // String x=s;
        // String t="";
        // for(int i=s.length()-1;i>=0;i--){
        //     t+=s.charAt(i);
        // }
        // if(t.equals(x)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not a Palindrome");
        // }
        

        // //Prime numb in given range
        // int m=sc.nextInt();
        // int n=sc.nextInt();
        // for(int i=m;i<=n;i++){
        //     boolean isprime=true;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //             isprime=false;
        //             break;
        //         }
        //     }
        //     if(isprime){
        //         System.out.println(i);
        //     }
        // }

        // //Given number is Prime or not

        // int n=sc.nextInt();
        // if(n==1) System.out.println(n+" is neither prime nor composit");
        // else{
        //     boolean isflag=true;
        //     for(int i=2;i<n;i++){
        //         if(n%i==0){
        //             isflag=false;
        //             System.out.println(n+" is not a prime");
        //             break;
        //         }
        //     }
        //     if(isflag){
        //         System.out.println(n+" is a prime");
        //     }
        // }
        

        // Factorial of a given number
        int n=sc.nextInt();
        int f=1;
        if(n==0) System.out.println(n);
        else{
            for(int i=1;i<=n;i++){
                f*=i;
            }System.out.println(f);
        }

    }
}
