package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
    //brute force approach => Time complexity = O(n^3)
    public static void maxSubArraySum(int[] arr) {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                currSum = 0;//making currSum 0 because, we have to check forEach sub array
                for(int k=start;k<=end;k++){
                    //System.out.print("["+arr[k]+"] ");
                    currSum+=arr[k];
                }
              // System.out.println(currSum);
               if(maxSum<currSum){
                maxSum = currSum;
            }
            }
            
               
        }
        System.out.println("Max Sum "+maxSum);  
    }
    
}
