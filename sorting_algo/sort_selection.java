package sorting_algo;
 import java.util.*;
public class sort_selection {
    public static void sort(int numbers[]){
        for(int i = 0; i < numbers.length - 1; i++) {

            int smallest = i;

            for(int j = i + 1; j < numbers.length; j++) {

                if(numbers[j] < numbers[smallest]) {
                    smallest = j;
                }
            }

            int temp = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = temp;
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
