import java.util.*;
public class largest_number{
    public static int largest(int numbers[]){
        int large=Integer.MIN_VALUE;
        int l=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
                l=i;

            }
        }
        return l;
    }
    public static void main(String[] args) {
        int numbers[]={1,7,4,8,9,2,4,7,11,91,4};
        int l= largest(numbers);
        System.out.println("Largest number is "+numbers[l] +" found at "+ l+ " position");

    }
}
