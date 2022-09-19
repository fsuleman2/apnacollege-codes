package Arrays;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int numArr[] = {2,4,6,8,10};
        printAllSubArrays(numArr);
    }

    public static void printAllSubArrays(int[] numArr) {
     int len = numArr.length;

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("["+numArr[k]+"] ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
