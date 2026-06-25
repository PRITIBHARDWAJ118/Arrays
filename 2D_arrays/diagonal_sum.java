import java.util.*;
public class diagonal_sum {
    public static void diagonal(int matrix[][]){
        int sumDi=0,sumD=0;
        //brute force
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=matrix.length;j++){
            if(i==j){
                sumDi+=matrix[i][j];
            }
            if(i+j==matrix.length-1){
                sumD+=matrix[i][j];
            }}
        }
        //O(n)
        for(int i=0;i<matrix.length;i++){
            sumDi+=matrix[i][i];
            if(i!=matrix.length-1-i)// removes the overalpping elements
                sumD+=matrix[i][matrix.length-1-i];
        }
        System.out.println("sum of primary  diagonal is: "+sumDi);
        System.out.println("Sum of secondary diagonal is "+ sumD);

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonal(matrix);
    }
}
