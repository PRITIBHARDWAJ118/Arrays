import java.util.*;
public class sub_arrays {
    public static void subarray(int number[]){
        int sum=0,max=Integer.MIN_VALUE;
        for (int i=0;i<number.length;i++){
            int start=i;
            sum=0;
            for(int j=i;j<number.length;j++){
               int end=j;
               sum=0;
               for(int k=start;k<=end;k++){
                System.out.print(number[k]+ " ");
                sum=sum+number[k];//sum od sub arrays
               }
               System.out.print("Sum is :"+ sum);
               //maximum sum of subarray 
               if(sum>max){
                max=sum;
               }
               System.out.println(" ");
            }
         System.out.println(" ");
        }
        System.out.println("Maximum sum is: "+ max);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
        
    }
}
