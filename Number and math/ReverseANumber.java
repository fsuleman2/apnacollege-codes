import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        int reversed=0,lastDigit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int x = sc.nextInt();
        sc.close();
        // 120398
        // 893021
        while (x > 0) {

            //line to get the last digit of a number
            lastDigit = x % 10;
            reversed=reversed*10+lastDigit;
            //line to remove the last digit
            x = x / 10;
        }
        System.out.print(reversed);
    }
}
