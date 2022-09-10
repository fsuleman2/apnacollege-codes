import java.util.Scanner;

public class InvHalfWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        invertedPatternHalfWithNumbers(num);
        sc.close();
    }

    public static void invertedPatternHalfWithNumbers(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){ //other approach (j=1; j=n-i+1; j++)
                System.out.print(n-j+1); //System.out.print(j+"");
            }
            System.out.println();
        }
        
    }
}
