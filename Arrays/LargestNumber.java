import java.util.*;

public class LargestNumber{

    public static void main(String args[]){
        int num[] = {10,20,30,40,50,60,70,80,90,300};
        largest_Number(num);
    }
    public static void largest_Number(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.print("Largest : " + largest);
    }
}