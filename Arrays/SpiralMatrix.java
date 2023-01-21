package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };
            printSpiralMatix(matrix);
    }

    public static void printSpiralMatix(int[][] matrix) {
        int startRow = 0,
            startCol = 0,
            endRow = matrix.length-1,
            endCol = matrix[0].length-1;
            
            while(startRow<=endRow && startCol<= endCol){
                //for top elements printing=> here j denotes column i for rows
                for(int j=startCol;j<=endCol;j++){
                    System.out.print(matrix[startRow][j]+" ");
                }
                //for right side boundry
                for(int i=startRow+1;i<=endRow;i++){
                    
                    System.out.print(matrix[i][endCol]+" ");
                }
                //for bottom side boundry
                for(int j=endCol-1;j>=startRow;j--){
                    if(startCol==endCol){
                        break;
                    }
                    System.out.print(matrix[endRow][j]+" ");
                }
                //for left side boundry
                for(int i=endRow-1;i>=startRow+1;i--){
                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(matrix[i][startRow]+" ");
                }
                startRow++;
                startCol++;
                endCol--;
                endRow--;

                }
            }
    }

