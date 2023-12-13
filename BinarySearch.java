import java.util.*;
public class JavaBasics{
    public static int BinarySearch(int arr[], int key){
       int start = 0;
       int end =arr.length-1;
       while(start <= end){
           int mid =(start+end)/2;
           if(arr[mid] == key){
               return mid;
           }
           if(arr[mid] < key){
               start = mid+1;
               
           }else{
               end = mid - 1 ;
           }
       }
       return -1;
    }
    public static void main(String args[]){
        int arr[] ={2,4,3,6,9,10,12};
        int key = 9;
        System.out.println("Index is ="+BinarySearch(arr, key));
    }
}
