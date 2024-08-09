import java.util.*;

class MissingNumber{
    public static void main(String args[]){
        int nums[] = {1, 0, 3};
        System.out.print(missing_number(nums));
    }
    public static int missing_number(int nums[]){
        int n_xor = nums.length;
        for(int i = 0; i < nums.length; i++){
            n_xor = n_xor^i;
            n_xor = n_xor^nums[i];
        }
        return n_xor;
    }
}