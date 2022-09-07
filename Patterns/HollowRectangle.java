import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int totRows,int totCols){

        for(int i=1; i<=totRows; i++){
            //inner loop for cols
            for(int j=1;j<=totCols;j++){
                //for boundry condition if satisfied print *
                if(i == 1 || i==totRows || j ==1 || j ==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of colums");
        int cols = sc.nextInt();

        hollowRectangle(rows, cols);
        sc.close();
    }
}
