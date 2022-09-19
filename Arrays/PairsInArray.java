package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int numArr[] = {2,5,8,9,10,12};
        printPairs(numArr);
    }

    public static void printPairs(int[] numArr) {
        int len = numArr.length;
        for(int i=0;i<len;i++){
            int curr = numArr[i];
            for(int j=i+1;j<len;j++){
                System.out.print("("+curr+","+numArr[j]+")");
            }
            System.out.println();
        }
    }
}
//TC: O(n^2)
//Formular to count total number of pairs: n(n-1)/2 Arthimatic progression
