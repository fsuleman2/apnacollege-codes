public class PrimeInRange{
    public static void main(String[] args) {
        isPrimeCheckInRange(10);
    }
    /**
     * @param range
     */
    public static boolean isPrimeOrNot(int num){
        boolean IsPrime=true;
        if(num==2){
            IsPrime=true;
        }
        else{
            //i<=Math.sqrt(num) is been used for optimization and to avoid repitation
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%2==0){
                    IsPrime=false;
                }
            }
            if(IsPrime){
              IsPrime = true;
            }else{
                IsPrime=false;
            }
        }
        return IsPrime;
    }
    public static void isPrimeCheckInRange(int range){
        for(int i=2;i<=range;i++){
            if(isPrimeOrNot(i)){
                System.out.println(i+" is a prime number");
            }
            else{
                System.out.println(i+" is not a prime number");
            }
        }
    }
}

