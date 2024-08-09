public class CeilingandFloor{

    public static void main(String args[]){

        int[] arr = { 2 , 4, 6 ,8 , 12, 15, 20};
        System.out.println("Ceiling : " + Ceiling_of_number(arr,9));
        System.out.println("Floor : " + Floor_of_number(arr,9));
    }

    // Ceiling = smallest number greater than or equal to target
    public static int Ceiling_of_number(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(nums[mid] == target){
                return target;
            }
            if(nums[mid] < target){
                si = mid + 1;
            }
            if(nums[mid] > target){
                ei = mid-1;
            }
        }
        return nums[si];
    }

    // floor = largest number gsmaller than or equal to target
    public static int Floor_of_number(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(nums[mid] == target){
                return target;
            }
            if(nums[mid] < target){
                si = mid + 1;
            }
            if(nums[mid] > target){
                ei = mid-1;
            }
        }
        return nums[ei];
    }
}