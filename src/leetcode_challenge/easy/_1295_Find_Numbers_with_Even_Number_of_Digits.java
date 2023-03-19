package leetcode_challenge.easy;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public static void main(String[] args) {
        int num[] = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0) count++;
        }

        return count;
    }

    private static int countDigits(int num) {
        int count = 0;
        int result = num;

        while (result != 0) {
            result = num / 10;
            num = result;
            count++;
        }

        return count;
    }
}
