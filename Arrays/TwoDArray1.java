package Arrays;

import java.util.Scanner;

public class TwoDArray1 {
     // int[][] matrix= new int[3][3];
    // int n = arr.length, m = arr[0].length;// m = with this we will get col count
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. rows ");
        int r = sc.nextInt();
        System.out.println("Enter no. of cols ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
       
        System.out.println("Enter the " + (r * c) + " elements");
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(r,c,matrix);
        System.out.println("Enter an Key element u want to search");
        int key = sc.nextInt();
        boolean result = searchElementInMatrix(r,c,key,matrix);
        System.out.println(result);
        sc.close();
    }

    public static boolean searchElementInMatrix(int r, int c, int key, int[][] matrix) {
        //can apply any searching technicque
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == key){
                    System.out.println(key+" found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void printMatrix(int r, int c, int[][] matrix) {
        System.out.println("********************************");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

   
}
