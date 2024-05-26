import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = { 1, 3, 5, 4, 2, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target tobe found in Array : ");
        int target = sc.nextInt();
        int result = linear_search(arr,  target);
        System.out.print("Element found at index : " + result);
    }
    public static int linear_search(int[] array, int target){
         if(array.length==0){
             return -1;          //empty array
         }
         for(int i = 0; i < array.length; i++){
             if(array[i] == target){
                 return i;      //element found at index i
             }
         }
         return -1;             //element not found
    }
}