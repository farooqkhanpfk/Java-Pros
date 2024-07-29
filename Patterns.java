
public class Patterns {
    public static void main(String[] args) {
        int n=5;
        //Patterns of square
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }

        //Patterns of Right Angle Tringle
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }System.out.println( );
        }

        //Patterns of Reverse Right Angle Tringle
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*"+" ");
            }System.out.println(" " );
        }

        //Patterns of Triangls
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }for(int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }

        //Pattern of Hallow Square
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }

        //Pattern of Rombus Square
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }for(int j=0;j<n;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
