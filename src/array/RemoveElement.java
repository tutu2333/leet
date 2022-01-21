package array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            while (left <= right && nums[left] != val) {
                left++;
            }
            while (right >= left && nums[right] == val) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
                nums[right] = val;
            }
        }
        return left;
    }

}
