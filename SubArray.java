import java.util.*;
public class JavaBasics{
    public static void Subarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            int s =i;
            for(int j=i; j<arr.length; j++){
                int e =j;
                for(int k=s; k<=e; k++){
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        Subarray(arr);
    }
}
