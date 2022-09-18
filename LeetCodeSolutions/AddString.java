package LeetCodeSolutions;
public class AddString {
    public static void main(String[] args) {
        String result = addStrings("79","786");
        System.out.println(result);
    }
    //following school addition method with carry
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
     StringBuilder resultBuilder = new StringBuilder(); //to append and store the result/answer
     while ( i >= 0 || j >= 0 ) {
         int sum = 0;
         if ( i >= 0 ) sum += num1.charAt(i--) - '0'; //converting string to integer
         if ( j >= 0 ) sum += num2.charAt(j--) - '0';
         sum += carry;
         carry = sum / 10;
         sum = sum % 10;
         resultBuilder.append(sum);
     }
     if ( carry > 0 ) resultBuilder.append(carry);
     return resultBuilder.reverse().toString();   
     }
}
