class Solution {
    public int search(int[] arr, int target) {

        //search till pivot
        int s1 = 0;
        int e1 = pivot(arr);
        while(s1<=e1){
            int mid = s1 + (e1-s1)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e1 = mid-1;
            }else{
                s1 = mid+1;
            }
        }

        //search after pivot
        int s2 = pivot(arr)+1;
        int e2 = arr.length-1;
        while(s2<=e2){
            int mid = s2 + (e2-s2)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e2 = mid-1;
            }else{
                s2 = mid+1;
            }
        }
        return -1;
    }
    //pivot calculation
    private int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
