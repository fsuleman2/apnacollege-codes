import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number");
        int n = sc.nextInt();
        invertedRotatePyramid(n);
        sc.close();
        
    }
    public static void invertedRotatePyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
