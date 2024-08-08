public class BinarySearch{

    public static void main(String args[]){
        int[] arr = {2,4,8,13,30,34,45,80};
        int target = 45;

        System.out.println(BinarySearch(arr,target));
    }
    public static int BinarySearch(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return -1;
    }
}