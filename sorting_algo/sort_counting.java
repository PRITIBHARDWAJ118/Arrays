package sorting_algo;
import java.util.*;
public class sort_counting {
    public static void sort(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            largest=Math.max(largest,numbers[i]);
        }
        int countArray[]=new int[largest+1];//largest+1 bcuz we start from 0 till 7 so, 0 should also be counted, as in counted array only +ve numbers is atken so 0 will not be taken therefore largst+1
        //frequency calculation
        for(int i=0;i<numbers.length;i++){
           countArray[numbers[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                numbers[j]=i;
                j++;
                countArray[i]--;
            }
        }
    }
    public static void main(String[] args) {
         int numbers[]={1,4,1,3,2,4,3,7};
         sort(numbers);
         for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
       }
    }
}
