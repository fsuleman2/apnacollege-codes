package Arrays;
public class MaxSubArraySumPrefix {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubArraySumPrefix(arr);
    }
    //prefix approach => Time complexity = O(n^2)
    public static void maxSubArraySumPrefix(int[] arr) {
        int maxSum=Integer.MIN_VALUE,currSum=0;
        //step1 => calculating the sum of all possible arrays. for one itration
        //{1,-2,6,-1,3}=> 1,-1,3,5,4,7
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
             int start = i;
             for(int j = i;j<arr.length;j++){
                int end =j;
                //step-2elimiated k loop by writing prefix[end] - prefix[start-1] formula
                currSum = start==0?prefix[end]:prefix[end] - prefix[start-1];
             }
             if(maxSum<currSum){
                maxSum = currSum;
             }
        }
        System.out.println("Max Sum "+maxSum);
    }
}
