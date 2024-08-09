import java.util.*;

public class RemoveDuplicates{
    public static void main(String args[]){
        int nums[] = {0,1,1,1,2,2,3};
        System.out.println("Number of unique elements in array : " + remove_duplicates(nums));
        //first i+1 elemnts are unique
        System.out.println(Arrays.toString(nums));
    }
    public static int remove_duplicates(int nums[]){
        int i = 0;
        for(int j = 1; j < nums.length; j++ ){
            if(nums[i] != nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i+1;
    }
}