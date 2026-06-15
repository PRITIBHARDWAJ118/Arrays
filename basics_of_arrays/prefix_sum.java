import java.util.*;
public class prefix_sum {
    public static void subarray(int number[]){
        int sum=0,max=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];
        prefix[0]=number[0];
        //calculation of prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
            System.out.print(prefix[i]);
        }
        for (int i=0;i<number.length;i++){
            int start=i;
            sum=0;
            for(int j=i;j<number.length;j++){
               int end=j;
               
              sum= start==0 ? prefix[end]: prefix[end]-prefix[start-1];
              
               //maximum sum of subarray 
               if(sum>max){
                max=sum;
               }
              
            }
         
        }
        System.out.println("Maximum sum is: "+ max);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
        
    }
}
