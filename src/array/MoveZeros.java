package array;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }

        int left = 0;
        int right = 0;

        while (right < len) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
            right++;
        }
    }

}
