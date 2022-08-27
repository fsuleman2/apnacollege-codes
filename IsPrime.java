import java.util.Scanner;

public class IsPrime {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean IsPrime = true;
        
        if(num==2){
            System.out.println(num+" is a prime number");
        }
        else{
            //i<=Math.sqrt(num) is been used for optimization and to avoid repitation
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%2==0){
                    IsPrime=false;
                }
            }
            if(IsPrime){
                System.out.println(num+" is a prime number");
            }else{
                System.out.println(num+" is not a prime number");
            }
        }
        sc.close();
    }
}
