//      2.  Linear Search


import java.util.*;
public class ArrayCC {
    public static int linearsearch(int number[] , int key){
        for (int i=0 ; i<number.length ;i++) {
            if (number[i]== key){
                return 1;
            }
        }
        return -1 ;     
    }
    public static void main (String args[]) {
        int number[] ={2,4,6,8,10,12,14,16};
        int key =10;
        int index = linearsearch(number , key);
        if (index ==1 ){
            System.out.println("yes found " +key);
        }
        else{
            System.out.println("Not found ");
        }
        
    }
}
