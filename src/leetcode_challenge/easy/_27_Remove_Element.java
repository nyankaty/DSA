package leetcode_challenge.easy;

import java.util.Arrays;

public class _27_Remove_Element {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int size = nums.length;

        for (int i = 0; i < size;) {
            if (nums[i] == val) {
                for (int j = i; j <= size - 2; j++) {
                    nums[j] = nums[j + 1];
                }
                size--;
            } else {
                i++;
            }
        }

        return size;
    }
}
