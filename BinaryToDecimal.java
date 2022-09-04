import java.util.Scanner;

public class BinaryToDecimal {
    public static int BinToDec(int n){
        int dec=0,pow=0;

        while(n>0){
            int lastDigit = n%10;
            dec = dec + (int)(lastDigit * Math.pow(2, pow));
            n = n/10;
            pow++;
        }
        return dec;
    }
    public static boolean checkBinary(int num) throws Exception{
        try{
            String regexString = "[01][01]+";
            boolean result = Integer.toString(num).matches(regexString);
            return result;
        }catch(Exception e){
            throw new Exception("Please Enter Only binary Values"+ e.getMessage());
        }
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any Number with 0 and 1");
        try{
            int n = sc.nextInt();
            boolean checkBinary = checkBinary(n);
            if(checkBinary){
                int result = BinToDec(n);
                System.out.println("Decimal Value of Binar: "+n+" is "+result);
    
            }
            else{
                System.out.println("Please Enter binary number only!!!");
            }
        }catch(Exception e){
           
        }finally{
            sc.close();
        }
       
        
    }
}
