import java.util.*;
public class reverse_array {
    public static void reverse(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        int swap=0;
        while (start<=end){
            swap=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=swap;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,6};
        reverse(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
}
