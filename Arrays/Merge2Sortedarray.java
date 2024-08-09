import java.util.*;

public class Merge2Sortedarray{
    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int n = 3;
        int m = 3;

        merge_two_sorted_array(nums1, n, nums2, m);

        System.out.print("Merged array : " + Arrays.toString(nums1));
    }
    public static void merge_two_sorted_array(int nums1[], int n, int nums2[], int m){
        int i = n-1; 
        int j = m-1; 
        int k = n+m-1;

        while(i >= 0 && j >= 0){
            if( nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
                j--;
                k--;
        }
    }
}