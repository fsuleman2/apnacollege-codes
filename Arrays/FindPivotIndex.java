package Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int index = pivotIndex(nums);
        System.out.println(index);
    }
        
    

    public static int pivotIndex(int[] nums) {
        int sum=0,leftSum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
       int rightSum = sum;
        
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum == rightSum){
                return i;
              
            }
        leftSum+=nums[i];
        }
          return -1;
    }
    

}
