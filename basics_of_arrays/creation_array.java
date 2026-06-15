import java.util.*;
public class creation_array {
    public static void main(String args[]){
        int newArray[]=new int[2];
        int i;
        System.out.println("Enter values of array");
        Scanner sc= new Scanner(System.in);
        for(i=0;i<newArray.length;i++){
           newArray[i]=sc.nextInt(); 
        }
        
        System.out.println("Array: " + Arrays.toString(newArray));
    }
    
}
