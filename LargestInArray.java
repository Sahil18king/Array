//        4.  Largest nad Smallest In an Array

import java.util.*;
public class ArrayCC{
    public static int SearchLargest(int number[]){
        int largest = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<number.length ; i++) {
            if(number[i] > largest) {
                largest =number[i];
            }
            
                if(smallest > number[i]){
                    smallest = number[i];
                }
            }
            System.out.println("Smallest number is :" +smallest);
        return largest;
     
        }
        
    public static void main (String args []) {
        int number[] ={2,4,6,8,10,1,2,3};
       System.out.println("largest number is : " +SearchLargest(number));
        

    }
}
