import java.util.*;
public class call_by_reference_arrays {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;

        }
    }
    public static void main(String[] args) {
        int marks[]={99,97,99};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
