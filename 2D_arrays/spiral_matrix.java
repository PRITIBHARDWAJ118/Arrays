import java.util.*;

public class spiral_matrix {
    public static void spiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix.length-1;
        while(startRow<=endRow && startCol<=endCol)
        {
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.println(matrix[startRow][i]+" ");
            }
            //right 
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(matrix[i][endCol]);
            }
            //bottom
             for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){ break;}// when nxn is odd and we need to print the last middle element what is left then we use this
                System.out.println(matrix[endRow][i]);
            }
            //left
             for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){ break;}
                System.out.println(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);

    }
    
}
