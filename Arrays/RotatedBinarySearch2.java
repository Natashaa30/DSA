public class RotatedBinarySearch{
    public static void main(String args[]){
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 2, 3};
        int target = 2;
        System.out.println(pivot(arr));
        System.out.println(RoatatedBinarySearch(arr,target));
    }
    public static int pivot(int[] arr){
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
    public static int RoatatedBinarySearch(int[] arr, int target){
        int s1 = 0;
        int e1 = pivot(arr);
        if(BinarySearch(arr, target, s1, e1) != -1){
            return BinarySearch(arr, target, s1, e1);
        }
        int s2 = pivot(arr)+1;
        int e2 = arr.length-1;
        
        return BinarySearch(arr, target, s2, e2);
        
    }
    public static int BinarySearch(int[] arr, int target, int s1, int e1){
    
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
        return -1;
    }
}
