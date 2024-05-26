
import java.util.Scanner;
// import java.util.Array;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] nums = new int[10];  //initialization

        Scanner sc = new Scanner(System.in);

        input_Array(nums);

        output_Array(nums);

        reverse_Array(nums);

        output_Array(nums);
    }
    public static void input_Array (int[] nums ){
        System.out.print("Enter "+ nums.length +" Integer values : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
    }
    public static void output_Array (int[] nums ){
        System.out.print("Your Array is : ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void reverse_Array(int[] arr){
        int start_index = 0;
        int end_index = arr.length-1;
        while(start_index<end_index){
            int temp = arr[start_index];
            arr[start_index] = arr[end_index];
            arr[end_index] = temp;
            start_index++;
            end_index--;
        }
    }
}