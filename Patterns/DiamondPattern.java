import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        diamondPattern(n);
        sc.close();
    }

    public static void diamondPattern(int n) {
       //formula 2i-1
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
            System.out.print("*");
            }
            System.out.println();
        }
        //for second s
        for(int i=n;i>=1;i--){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
