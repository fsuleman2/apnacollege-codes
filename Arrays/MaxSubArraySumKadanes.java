package Arrays;

public class MaxSubArraySumKadanes {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySumKadanes(arr);
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
            if(currSum<0){
                currSum=0;
            }
           maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Shradha: Maximum Sum of an subarray is => "+maxSum);
    }
}
