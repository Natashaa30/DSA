public class FirstandLastOccurence{

    public static void main( String args[]){
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;

        int[] result = firstAndLastOccurence(nums,target);
        System.out.println("First occurence : " + result[0]);
        System.out.println("First occurence : " + result[1]);
    }

    public static int[] firstAndLastOccurence(int[] nums, int target){

        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    public static int search(int[] nums, int target, boolean findingStartIndex){
        int ans = -1;  
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(target < nums[mid]){
                ei = mid-1;
            }
            else if(target > nums[mid]){
                si = mid+1;
            }
            else{
                ans = mid;
                if(findingStartIndex){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
        }
        return ans;
    }
}