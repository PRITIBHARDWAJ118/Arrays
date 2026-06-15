import java.util.*;
public class binary_search{
    public static int search(int numbers[],int key){
        int mid;
        int start=0, end=numbers.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(numbers[mid]==key)
                return mid;
            else if (numbers[mid]<key){
                start=mid+1;
            }
            else if (numbers[mid]>key){
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key=2;
        int l=search(numbers,key);
        if(l!=-1)
            System.out.println("Found number at "+ l+ "position");
        else 
            System.out.println("Not found");

    }
}