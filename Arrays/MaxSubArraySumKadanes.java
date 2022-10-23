package Arrays;

public class MaxSubArraySumKadanes {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr1 = {-1,0,-3};
        maxSubArraySumKadanes(arr);
        maxSubArray(arr1);
        maxSubArraySumKadanesShradhaApproach(arr);
    }

    public static void maxSubArraySumKadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE,currSum = arr[0];
        for(int i=0;i<arr.length;i++){
            currSum = currSum+arr[i]<0?currSum=0:currSum+arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println("Maximum Sum of an subarray is => "+maxSum);
    }
    public static void maxSubArraySumKadanesShradhaApproach(int[] arr) {
        int maxSum = Integer.MIN_VALUE,currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum<0){
                currSum=0;
            }
           
        }
        System.out.println("Shradha: Maximum Sum of an subarray is => "+maxSum);
    }
    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE,currSum = 0,currMin=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             currSum += arr[i];
             if(currSum<0){
                 currMin = Math.max(currMin,currSum);
                 maxSum = currMin;
                 currSum=0;
             }else{
                  maxSum = Math.max(currSum, maxSum);
             }
           
         }
         return maxSum;
     }
}
