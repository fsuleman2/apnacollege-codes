package Arrays;
public class TrappedRainWater {
    public static void main(String[] args) {
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
       int totTrappedRainWater = trappedRainWater(height);
       System.out.println("Total Trapped Rain Water = "+totTrappedRainWater);
    }

    public static int trappedRainWater(int[] height) {
        int n = height.length;
         //calculating Left max boundary - array
         int leftMax[] = new int[n];
         //by default 0th ele will be leftMax
         leftMax[0] = height[0];
         //loop for getting all left most max elements
         for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
         }
         //calculating Right max boundary - array
         int rightMax[] = new int[n];
         //by default 0th ele will be leftMax
         rightMax[n-1] = height[n-1];
         //loop for getting all Right most max elements
         for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }
         //now we got all the left & rigt max boundaries
         //we calculate trapped rain water by using the formula (waterlevel- heightofbars)*width(optional for now)
         int trappedRainWater=0;
         int waterLevel=0;
         for(int i=0;i<n;i++){
            //waterlevel = min(leftmax bound,rightmax bound)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainWater+= waterLevel-height[i];
         }
         return trappedRainWater;
    }
   
}
