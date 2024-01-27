public class Javabasics{
    public static void main(String args[]) {
        int arr[] ={2,4,6,8,10};
        Subarray(arr);
    }
    public static void Subarray(int arr[]){
        int maxsum =Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum =0 ;
                for(int k=i ; k<=j; k++){
                    // System.out.print(arr[k]+",");
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(currsum > maxsum){
                    maxsum = currsum ;
                }
            }
        }
        System.out.println("maxsum = "+maxsum);
    }
    
}
