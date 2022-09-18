package Arrays;
public class LargestNumInArray {
    public static void main(String[] args) {
        int[] numArr = {2,5,7,22,8,9,10,12,14,15,18};
        int largestNumInArray = largestNumInArray(numArr);
        int smallestNumInArray = smallestNumInArray(numArr);
        System.out.println("Largest Number in an given Array is "+largestNumInArray);
        System.out.println("Largest Number in an given Array is "+smallestNumInArray);
    }

    public static int largestNumInArray(int[] numArr) {
        int MAX_VALUE = Integer.MIN_VALUE;
        for(int i=0;i<numArr.length;i++){
            if(MAX_VALUE<numArr[i]){
                MAX_VALUE=numArr[i];
            }
        }
        return MAX_VALUE;
    }
    public static int smallestNumInArray(int[] numArr) {
        int MIN_VALUE = Integer.MAX_VALUE;
        for(int i=0;i<numArr.length;i++){
            if(MIN_VALUE>numArr[i]){
                MIN_VALUE=numArr[i];
            }
        }
        return MIN_VALUE;
    }
}
