package sorting_algo;
import java.util.*;
public class sort_insertion {
    public static void sort(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int curr=numbers[i];
            int prev=i-1;
            //findingout the correct position
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            // insering those elements
            numbers[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
       sort(numbers);
       for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
       }
    }
}
