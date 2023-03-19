package leetcode_challenge.easy;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {0,3,6};
        int m = 4;
        int n = 3;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int num : nums2) {
            pushItemToNums1(num, nums1, m);
            m++;
        }
    }

    private static void pushItemToNums1(int item, int[] nums1, int m) {
        boolean anyMatch = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > item) {
                anyMatch = true;

                for (int j = m - 1; j >= i; j--) {
                    nums1[j+1] = nums1[j];
                }

                nums1[i] = item;
                break;
            }
        }

        if (anyMatch == false) {
            nums1[m] = item;
        }
    }

}
