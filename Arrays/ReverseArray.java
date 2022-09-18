package Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] numArr = {2,5,7,22,8,9,10,12,14,15,18};
        reverseArray(numArr);
    }

    public static void reverseArray(int[] numArr) {
        System.out.println("Array Before Reverse");
        for(int i=0;i<numArr.length;i++){
           
            System.out.print("=>"+numArr[i]);
        } 
        System.out.println();
        int firstElement = 0;
        int lastElement = numArr.length-1;
        while(firstElement!=lastElement){
            int temp = numArr[firstElement];
            numArr[firstElement] = numArr[lastElement];
            numArr[lastElement] = temp;
            firstElement++;
            lastElement--;
        }
         System.out.println("Array After Reverse");
        for(int i=0;i<numArr.length;i++){
           
            System.out.print(numArr[i]+"=>");
        }   
        System.out.println();
    }    
}
