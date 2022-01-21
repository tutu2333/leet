package array;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] results = new int[len];
        int left = 0;
        int right = len - 1;
        int index = len - 1;
        while (left <= right) {
            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                results[index] = nums[right] * nums[right];
                right--;
            } else {
                results[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return results;
    }

}
