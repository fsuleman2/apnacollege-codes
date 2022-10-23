package Arrays;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int numArr[] = {-2,1,-3,4,-1,2,1,-5,4};
        printAllSubArrays(numArr);
    }

    public static void printAllSubArrays(int[] numArr) {
     int len = numArr.length;
     int currSum=0,maxSum=0;

        for(int i=0;i<len;i++){
             int sum=0;
            for(int j=i;j<len;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("["+numArr[k]+"] ");
                    sum+=numArr[k];//2//2+4//2+4+6//2+4+6+8//2+4+6+8+10=>
                }
                if(currSum<sum){
                    currSum=sum;
                }
                maxSum = Math.max(maxSum, currSum);
                System.out.println();
            }
            System.out.println("Total Sum  = "+ sum);
        }
System.out.println("Max sum "+maxSum);
    }
}
